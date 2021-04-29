package com.demo.parking_access.jjwApi;

import com.alibaba.fastjson.JSONObject;
import com.demo.parking_access.entity.Park;
import com.demo.parking_access.mapper.ParkHandoverMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class ApiUtil {



    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    // 计算并获取CheckSum
    public static String getCheckSum(String appSecret, String nonce, String curTime) {
        return encode("sha1", appSecret + nonce + curTime);
    }

    // 计算并获取md5值
    public static String getMD5(String requestBody) {
        return encode("md5", requestBody);
    }

    private static String encode(String algorithm, String value) {
        if (value == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(value.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }


    //MD5签名
    public static String getMD5ofStr(String origString) {

        System.out.println("MD5签名内容：" + origString);
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(origString.getBytes("UTF-8"));
            byte[] result = md5.digest();
            String origMD5 = byteArray2HexStr(result);
            return origMD5.toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //MD5签名
    private static String byteArray2HexStr(byte[] bs) {
        StringBuilder md5StrBuff = new StringBuilder();
        for (byte b : bs) {
            if (Integer.toHexString(0xFF & b).length() == 1) {
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & b));
            } else {
                md5StrBuff.append(Integer.toHexString(0xFF & b));
            }
        }
        return md5StrBuff.toString();
    }


    //http调用
    public static String postNewMethod(String url, JSONObject requestPara, String sign) throws Exception {
        // 创建HttpClient对象
        HttpClient httpClient = HttpClients.createDefault();


        // 创建POST请求
        HttpPost post = new HttpPost(url);
        post.addHeader("sign", sign);
        post.addHeader("Content-Type", "application/json;charset=UTF-8");


        if (requestPara != null) {
            StringEntity se = new StringEntity(requestPara.toString(), "UTF-8");
            post.setEntity(se);
        } else {
            post.setEntity(null);
        }

        // 得到响应并转化成字符串
        HttpResponse response = httpClient.execute(post);
        HttpEntity httpEntity = response.getEntity();
        String result = EntityUtils.toString(httpEntity, "utf-8");
        return result;
    }


    /**
     * 时间戳
     * @return
     */
    public static String CreateDate(){
        String dataStr=null;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前string类型时间
        dataStr = sdf.format(new Date());
       /* long time = 1l;
        try {
             time = sdf.parse(dataStr).getTime(); //转换成毫秒时间戳
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        return dataStr;
    }
    /**
     * 失效时间 当前时间+15min
     * @param
     * @return
     */
    public static long expriredDate(){
        String aDataStr=null;
        long time = 1l;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse(CreateDate());
            date.setTime(date.getTime()+15*60*1000);
            // aDataStr=sdf.format(date); string类型时间
            time = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }


    public static void main(String[] args) {
        long curTime = System.currentTimeMillis();
        Random r = new Random();
        int nonce = r.nextInt(32766);
        String checkSum = getCheckSum("CUVrOPDqKDMWb6Xzgoqj65fc6zWaUZ", String.valueOf(nonce), String.valueOf(curTime));
        //parktest2.jtcx.sh.cn  reserves params  http://parkzhtc.jtcx.sh.cn:80
        String reportURL = "http://parkzhtc.jtcx.sh.cn:80/service/parkinglot/notify/pathurl/pd31011500280?"
                + "appId=048a26c967004e319cc19af78eef8b6c&nonce=" + String.valueOf(nonce) + "&curTime=" + String.valueOf(curTime) + "&checkSum=" + checkSum;
        System.out.println(reportURL);
        //准备json参数
        //保证转字符串后顺序也一致
        JSONObject carInJson = new JSONObject(new LinkedHashMap());
        carInJson.put("urlType",4);
        carInJson.put("url","http://www.shmuyun.cn/parking_access/api/seekCar.ss"); //payInfo.ss  paySuccess.ss  Invoice.ss  seekCar.ss
        carInJson.put("leftValidTime",900);
        carInJson.put("dataTime",curTime);
        //计算签名
        String sign = getMD5ofStr("CUVrOPDqKDMWb6Xzgoqj65fc6zWaUZ|".concat(carInJson.toString()));


        System.out.println(sign);


        String resultStr = null;
        try {
            resultStr = postNewMethod(reportURL, carInJson, sign);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //解析结果
        JSONObject resultJson = JSONObject.parseObject(resultStr);

        System.out.println("解析结果：" + resultJson);


    }

}
