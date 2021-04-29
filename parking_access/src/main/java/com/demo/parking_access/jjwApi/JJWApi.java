package com.demo.parking_access.jjwApi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.parking_access.controller.ParkHandover;
import com.demo.parking_access.entity.*;
import com.demo.parking_access.mapper.ParkHandoverMapper;
import com.demo.parking_access.util.RedisUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.graphbuilder.curve.NURBSpline;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.*;

@Controller
@RequestMapping(value = "api")
public class JJWApi {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ParkHandoverMapper parkHandoverMapper;

    @Autowired
    private ParkHandover parkHandover;

    @Autowired
    private  RedisUtil redisUtil;


    //预约信息  被本地端调用 jsonArray -> {new reserves(),new reserves()}
    @RequestMapping("sendReserves.ss")
    @ResponseBody
    public boolean sendReserves(JsonObject jsonObject) {
        JsonArray jsonArray = jsonObject.getAsJsonArray("data");
        for (int y = 0; y < jsonArray.size(); y++) {
            //再将你取出来的list值重新赋值给JSONObject
            String jsonStr = jsonArray.get(y).toString();
            Reserves reserves = JSON.toJavaObject(JSONObject.parseObject(jsonStr), Reserves.class);
        }
        return true;
    }

    @Scheduled(cron = "0 0 0 * * ?")//每天凌晨  //fixedDelay = 3000 3s一次
    public void sendpp(){
        logger.info("启动定时任务");
        try {
            redisUtil.set("no", "0000001");
            redisUtil.set("payNo", "0000001");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //下载订单  被本地端调用
    @RequestMapping("payBill.ss")
    @ResponseBody
    public Object payBill(JsonObject jsonObject) {
        JsonArray jsonArray = jsonObject.getAsJsonArray("data");
        for (int y = 0; y < jsonArray.size(); y++) {
            //再将你取出来的list值重新赋值给JSONObject
            String jsonStr = jsonArray.get(y).toString();
            PayBill payBill = JSON.toJavaObject(JSONObject.parseObject(jsonStr), PayBill.class);
        }
        return true;
    }

    //下载订单  被本地端调用
    @RequestMapping("stagger.ss")
    @ResponseBody
    public Object stagger(JsonObject jsonObject) {
        //JSONObject
        Stagger stagger = JSON.toJavaObject(JSONObject.parseObject(jsonObject.toString()), Stagger.class);
        return true;
    }

    //支付查询费用
    @RequestMapping("payInfo.ss")
    @ResponseBody
    public Object payInfo(@RequestBody PayInfo payInfo,HttpServletResponse response) {
        logger.info("查询支付费用："+payInfo.toString());
        int code = 0;
        String mewssage = "success";
        PayInfo result = new PayInfo();
        int totalMoney = 0;
        Park park = parkHandoverMapper.getParkJJW(payInfo.getParkingId());
        String license = payInfo.getPlateId();
        //查询在场车辆
        CarLogPresent carLogPresent = parkHandoverMapper.getCarLog(new CarLogPresent(park.getUuid(), license));
        if (null != carLogPresent) {
            switch (carLogPresent.getCarType()) {
                case 1:
                    int timeLong = payInfo.getDataTime().intValue() / 1000 - carLogPresent.getEnterTime();
                    String smallCarSolutionUuid = park.getBaseRentTollSolutionUuid(); //获取小型车方案uuid
                    Feesolution feesolution = parkHandoverMapper.selectFeesolution(smallCarSolutionUuid); //获取小型车方案信息
                    feesolution.setFeeplanList(parkHandoverMapper.selectFeeplan(smallCarSolutionUuid));
                    feesolution.setLadderPriceList(parkHandoverMapper.selectLadder(smallCarSolutionUuid));
                    float amount = parkHandover.billing(feesolution, carLogPresent); //original_amount
                    amount = parkHandover.ratherAmount(amount, feesolution);
                    totalMoney = (int) (amount * 100);

                    String no = (ApiUtil.CreateDate().substring(0, 10).replace("-", "") + payInfo.getParkingId()).toUpperCase(); //当前日期+parkingId
                    String payNo = (payInfo.getParkingId() + ApiUtil.CreateDate().substring(0, 10).replace("-", "")).toUpperCase(); //parkingId+当前日期
                    result = new PayInfo(payInfo.getParkingId(), getNewEquipmentNo(no), getNewEquipmentNo(payNo), carLogPresent.getLicense(), carLogPresent.getCarType(),
                            (long) (carLogPresent.getEnterTime()) * 1000, totalMoney, 0, 0, "", totalMoney, ApiUtil.expriredDate(), "停车费用", new Date().getTime());
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } else {
            code = 404;
        }
        /*JSONObject carInJson = new JSONObject(new LinkedHashMap());
        carInJson.put("code", code);
        carInJson.put("mewssage", mewssage);
        carInJson.put("data", result);*/

        ResultViewModel resultViewModel = new ResultViewModel();
        resultViewModel.setCode(code);
        resultViewModel.setMessage(mewssage);
        resultViewModel.setData(result);
        logger.info("返回数据："+resultViewModel.toString());
        return resultViewModel;

    }

    //支付返回
    @RequestMapping("paySuccess.ss")
    @ResponseBody
    public Object paySuccess(@RequestBody PaySuccess pay) {
        logger.info("支付返回：" + pay.toString());
        int code = 0;
        try {
            //支付成功
            if ((int)pay.getPayStatus() == 1) {
                Park park = parkHandoverMapper.getParkJJW(pay.getParkingId());
                CarLogPresent carLogPresent = parkHandoverMapper.getCarLog(new CarLogPresent(park.getUuid(), pay.getPlateId()));
                pay.setParkUuid(park.getUuid());
                pay.setLogUuid(carLogPresent.getUuid());
                Number payTime = (long)pay.getPayTime()/1000L;
                pay.setPayTime(payTime);
                System.out.println("payTime:"+pay.getPayTime());
                //更新进出记录  将返回的进出订单号编号新增字段添加
                parkHandoverMapper.updateCarLogJJW(pay);
                //更新在场车辆线上支付
                parkHandoverMapper.updateCarLogPresentJJW(pay);
                //添加付款记录
                parkHandoverMapper.addPayLogJJW(pay); //将返回的支付订单号编号新增字段添加
                //存入redis
            } else {
                //未成功
                code = 500;
            }
        } catch (Exception e) {
            code = 500;
            e.printStackTrace();
        }
        ResultViewModel resultViewModel = new ResultViewModel();
        resultViewModel.setCode(code);
        resultViewModel.setMessage("success");
        logger.info("返回数据："+resultViewModel.toString());
        return resultViewModel;
    }

    //优惠查询
    public void reduces(String parkUuid, String plateId) {
        Map map = Url(parkUuid, "/parkinglot/download/reduces/");
        //准备json参数
        //保证转字符串后顺序也一致
        JSONObject carInJson = new JSONObject(new LinkedHashMap());
        carInJson.put("plateId", plateId);
        carInJson.put("vehicleType", 1);
        //计算签名
        String sign = ApiUtil.getMD5ofStr((map.get("appSecret") + "|").concat(carInJson.toString()));
        System.out.println("签名：" + sign);
        String resultStr = null;
        try {
            resultStr = ApiUtil.postNewMethod((String) map.get("url"), carInJson, sign);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //解析结果
        JSONObject resultJson = JSONObject.parseObject(resultStr);
        System.out.println("解析结果：" + resultJson.toJSONString());
    }

    //免密支付
  /*  @RequestMapping("payment.ss")
    @ResponseBody*/
    public Object payment(PayInfo payInfo) {
        int totalMoney = 0;
        Park park = parkHandoverMapper.getParkJJW(payInfo.getParkingId());
        String license = payInfo.getPlateId();
        //查询在场车辆
        CarLogPresent carLogPresent = parkHandoverMapper.getCarLog(new CarLogPresent(park.getUuid(), license));
        if (null != carLogPresent) {
            switch (carLogPresent.getCarType()) {
                case 1:
                    String smallCarSolutionUuid = park.getBaseTempTollSolutionUuid(); //获取小型车方案uuid
                    Feesolution feesolution = parkHandoverMapper.selectFeesolution(smallCarSolutionUuid); //获取小型车方案信息
                    feesolution.setFeeplanList(parkHandoverMapper.selectFeeplan(smallCarSolutionUuid));
                    feesolution.setLadderPriceList(parkHandoverMapper.selectLadder(smallCarSolutionUuid));
                    float amount = parkHandover.billing(feesolution, carLogPresent); //original_amount
                    amount = parkHandover.ratherAmount(amount, feesolution);
                    totalMoney = (int) (amount * 100);
                case 2:
                    break;
            }
        } else {
            Map map = new HashMap();
            map.put("code", 404);
            return map;
        }
        Payment payment = new Payment(carLogPresent.getUuid(), carLogPresent.getUuid(), carLogPresent.getLicense(), carLogPresent.getCarType(),
                carLogPresent.getEnterTime() * 1000, totalMoney, 0, 0, "", totalMoney, ApiUtil.expriredDate(), System.currentTimeMillis());
        Map map = Url(park.getJjwparkId(), "/parkinglot/submit/payment/");
        //准备json参数
        //保证转字符串后顺序也一致
        JSONObject carInJson = new JSONObject(new LinkedHashMap());
        carInJson.put("data", payment);
        //计算签名
        String sign = ApiUtil.getMD5ofStr((map.get("appSecret") + "|").concat(carInJson.getJSONObject("data").toString()));
        System.out.println("签名：" + sign);
        String resultStr = null;
        try {
            System.out.println("访问URL:" + map.get("url"));
            resultStr = ApiUtil.postNewMethod((String) map.get("url"), carInJson.getJSONObject("data"), sign);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //解析结果
        JSONObject resultJson = JSONObject.parseObject(resultStr);
        System.out.println("解析结果：" + resultJson.toJSONString());

        return resultJson;
    }

    //查询支付信息
    @RequestMapping("payresult.ss")
    @ResponseBody
    public Object payresult(Payresult payresult) {
        Map map = Url(payresult.getParkingId(), "/parkinglot/query/payresult/");
        //准备json参数
        //保证转字符串后顺序也一致
        JSONObject carInJson = new JSONObject(new LinkedHashMap());
        carInJson.put("businessId", payresult.getBusinessId()); //业务订单号
        carInJson.put("orderId", payresult.getOrderId()); //支付订单号
        carInJson.put("dataTime", new Date().getTime()); //请求时间
        //计算签名
        String sign = ApiUtil.getMD5ofStr((map.get("appSecret") + "|").concat(carInJson.toString()));
        System.out.println("签名：" + sign);
        String resultStr = null;
        try {
            resultStr = ApiUtil.postNewMethod((String) map.get("url"), carInJson, sign);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //解析结果
        JSONObject resultJson = JSONObject.parseObject(resultStr);
        System.out.println("解析结果：" + resultJson.toJSONString());
        if (resultJson.getInteger("code") == 0) {
            if (resultJson.getString("data") != null) {
                Payresult payresult1 = JSON.toJavaObject(resultJson.getJSONObject("data"), Payresult.class); //获取支付订单信息
            }

        }
        return resultJson;
    }

    //发票开具请求
    @RequestMapping("Invoice.ss")
    @ResponseBody
    public Object Invoice(@RequestBody Invoice invoice) {
        Map map = new HashMap();
        //根据场站ip和车牌号查询支付订单信息返回
        Park park = parkHandoverMapper.getParkJJW(invoice.getParkingId());
        ResultViewModel resultViewModel = new ResultViewModel();
        if (null != park) {
            List<Invoice> invoiceList = parkHandoverMapper.getPayLogJJW(new Invoice(park.getUuid(), invoice.getPlateId()));
            resultViewModel.setCode(0);
            resultViewModel.setMessage("success");
            resultViewModel.setData(invoiceList);
        } else {
            resultViewModel.setCode(404);
            resultViewModel.setMessage("false");
        }
        return map;
    }

    //场内寻车
    @RequestMapping(value = "seekCar.ss")
    @ResponseBody
    public Object seekCar(@RequestBody SeekCar seekCar) {
        Map map = new HashMap();
        SeekCar car = new SeekCar(seekCar.getParkingId(), getNewEquipmentNo((ApiUtil.CreateDate().substring(0, 10).replace("-", "") + seekCar.getParkingId()).toUpperCase()), seekCar.getPlateId(), 1, "1号库", 1, "08", "场内寻车", new Date().getTime());
        ResultViewModel resultViewModel = new ResultViewModel();
        resultViewModel.setCode(0);
        resultViewModel.setMessage("success");
        resultViewModel.setData(car);
        return map;
    }


    //创建接口URL
    public Map<String, Object> Url(String parkingId, String Url) {
        System.err.println("id:" + parkingId);
        Park park = parkHandoverMapper.getParkJJW(parkingId);
        long curTime = System.currentTimeMillis();
        Random r = new Random();
        int nonce = r.nextInt(32766);
        String checkSum = ApiUtil.getCheckSum(park.getAppSecret(), String.valueOf(nonce), String.valueOf(curTime));
        String reportURL = "http://180.166.5.210:80/service" + Url + park.getJjwparkId() + "?"
                + "appId=" + park.getAppId() + "&nonce=" + String.valueOf(nonce) + "&curTime=" + String.valueOf(curTime) + "&checkSum=" + checkSum;
        Map<String, Object> map = new HashMap<>();
        map.put("url", reportURL);
        map.put("appId", park.getAppId());
        map.put("appSecret", park.getAppSecret());
        return map;
    }


    //订单序列号拼接自增
    public synchronized String getNewEquipmentNo(String equipmentNo) {
        //当redis查询不到值或者时间为00:00:00归零序列号
        try {
            if (null == redisUtil.get("no")) {
                redisUtil.set("no", "0000001");
            }
        } catch (Exception e) {
            redisUtil.set("no", "0000001");
            e.printStackTrace();
        }
        String no = (String) redisUtil.get("no");

        //将字符串转换为int类型
        int s = Integer.parseInt(no);
        //实现递增
        s++;
        String str = String.valueOf(s);
        int num = no.length() - String.valueOf(s).length();
        for (int i = 0; i < num; i++) {
            str = "0" + str;
        }
        redisUtil.set("no", str);

        if (equipmentNo != null && !equipmentNo.isEmpty()) {
            equipmentNo += no;
        }
        System.out.println(Thread.currentThread().getName() + equipmentNo);

        return equipmentNo;

    }

    public static void main(String[] args) {

        int time = 1618274208-1618267008;
        System.err.println(1618263408+time);
        /*JSONObject jsonObject = JSONObject.parseObject("{\"reserveId\":\"xxxxxx\",\"reserveStatus\":1,\"parkingId\":\"qp31022900183\",\"plateId\":\"皖AP1123\",\"reserveFrom\":1564649254258,\"reserveTo\":1564649254258,\"vehicleType\":1,\"dataTime\":1564649254258,\"remark\":\"xxxx\"}");
        Reserves reserves = JSON.toJavaObject(jsonObject, Reserves.class);
        System.out.println(reserves.getPlateId());*/

        /*new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                getNewEquipmentNo("db");
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                getNewEquipmentNo("db");
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                getNewEquipmentNo("db");
            }
        }, "C").start();*/


    }


}
