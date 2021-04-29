package com.demo.parking_access.mapper;

import com.demo.parking_access.handEntity.*;
import com.demo.parking_access.entity.*;
import com.demo.parking_access.jjwApi.Invoice;
import com.demo.parking_access.jjwApi.PaySuccess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ParkHandoverMapper {

    public LadderPrice getladderPrice(String uuid);

    //根据账号名称查询账号信息
    public Worker selectUserLogin(Worker worker);

    //根据parkId获取uuid
    public String getParkUuid(String parkid);

    //查询在场车次数量与停车场名称
    public CarLogPresent countCarPresent(String parkid);

    //查询停车场信息
    public Company getCompany(String parkid);

    //没有在场记录的月租离场
    public int addCarLogMin(HandCarLog carlog);

    //根据时间查询在场车辆全部信息
    public List<CarLogPresent> selectCarLogPresentPage(CarLogPresent car);

    //按时间查询在场车辆数量
    public int countCarPresentDate(CarLogPresent car);

    //车辆进场时添加数据
    public int addCarLogOver(HandCar carLog);

    //车辆进场时添加数据
    public int addCarLogOpenId(HandCar carLog);

    //添加车辆在场记录
    public int addCarLogPresent(HandCar carLog);

    //添加无牌车在场记录
    public int addCarLogPresentOpenId(HandCar carLog);

    //车辆出场缴费记录 临时
    public int addPayLog(PayLog payLog);

    //获取停车场全部闸口信息
    public List<HandGate> selectHandGate(HandGate gate);

    //获取停车场所有工作人员信息
    public List<HandWorker> synWorkers(HandWorker worker);

    //根据进出记录uuid删除在场车辆信息
    public int deleteCarLogPresent(String logUuid);

    //根据车牌号与停车场编码删除重复车辆
    public int deleteCarLogPresentUuid(String license, String parkid);

    //根据无牌车openid删除在场车辆
    public int deleteCarLogPresentOpenId(String openId, String parkid);

    //根据gateUuid查询出场临时表
    public NullCarOut getNullCarOut(String gateUuid);

    //根据gateUuid删除出场临时表
    public int deleteNullCarOut(String gateUuid);

    //根据gateUuid删除进场临时车辆表
    public int deleteNullCarEnter(String gateUuid);

    //增添收款记录
    public int addHandPayLog(HandCarLog carLog);

    //查询收费记录
    public List<HandPayLog> queryTransactions(HandPayLog payLog);

    //储蓄卡支付费用出场后更新卡上余额
    public int updateCar5(Carowner car);

    //根据方案uuid获取方案数据
    public Feesolution selectFeesolution(String uuid);

    //收费设置
    public List<Feeplan> selectFeeplan(String uuid);

    //阶梯
    public List<LadderPrice> selectLadder(String uuid);

    //更新进出记录
    public int updateCarLog(HandCarLog carLog);

    //JJW支付更新进出记录
    public int updateCarLogJJW(PaySuccess pay);

    //JJW支付更新在场车辆记录
    public int updateCarLogPresentJJW(PaySuccess pay);

    //JJW支付增加付款记录
    public int addPayLogJJW(PaySuccess pay);

    //更新无牌车进出记录
    public int updateCarLogOpenId(HandCarLog carLog);

    //更新线上支付后追加费用时的进出记录
    public int updateCarLogBeyond(HandCarLog carLog);

    //需要人工收费时在出场接口中更新进出记录的出场图片
    public int updateCarLogOutPic(HandCarLog carLog);

    //获取一天中入场的车辆数目
    public int getInCount(@Param(value = "parkid") String parkid, @Param(value = "enterTime")int enterTime, @Param(value = "exitTime")int exitTime);

    //获取一天中出场的车辆数目
    public int getOutCount(@Param(value = "parkid") String parkid,@Param(value = "enterTime")int enterTime, @Param(value = "exitTime")int exitTime);

    //进场月租车模糊查询
    public List<Carowner> carRent(Carowner carowner);

    //获取服务器所有月租、储值车数据
    public List<Carowner> getCarownerAll();

    //根据停车场编码获取park配置信息
    public Park getParkId(String parkId);

    //根据uuid获场站的线上支付方案
    public Park getPark(String uuid);

    //根据JJWparkid获取场站信息
    public Park getParkJJW(String jjwparkId);

    //根据parkUuid和车牌号获取付款记录返回开票数据
    public List<Invoice> getPayLogJJW(Invoice invoice);

    //获取六个月前的车辆进出图片存储路径
    public List<HandPicUrl> getOverduePictures(int exitTime);

    //根据uuid查询基本收费
    public Feeplan getfeeplan(Feeplan feeplan);

    //根据闸口uuid查询扫码情况
    public NullCarEnter getNullCarEnter(String gateUuid);

    //根据uuid获取在场车辆信息
    public CarLogPresent selectCarLogPresentUuid(HandCar carLog);

    //根据uuid获取进出记录
    public CarLog  selectCarlogUuid(String uuid);

    //根据uuid插入数据到进出表
    public int updateCarlogLevelCarLog(@Param(value = "parentId") String parentId,@Param(value = "uuid") String uuid);

    //根据uuid插入数据到在场车辆表
    public int updateCarlogPresentLevelCarLog(@Param(value = "parentId") String parentId,@Param(value = "uuid") String uuid);


    // --- //

    //根据闸口uuid查询信息
    public Gate getGateUuid(@Param(value = "gateUuid")String gateUuid);

    //获取单个车主信息
    public Carowner getCarownerUuid(@Param(value = "license")String license,@Param(value = "parkUuid")String parkUuid);

    //根据停车场编码和车牌获取在场车辆详细记录
    public CarLogPresent getCarLogPresent(HandCar handCar);

    //根据进出记录uuid获取信息
    public CarLogPresent  selectCaownerLogUuid(String logUuid);

    //查询选中停车场是否存在重复车牌
    public Carowner selectLicense(@Param(value = "license") String license,@Param(value = "parkuuid") String parkuuid);

    //根据停车场编码和车牌获取在场车辆详细记录
    public CarLogPresent getCarLog(CarLogPresent carLog);

    public Company getFacilityIdEnt(String idEntity);

    //更新车辆进出表优惠价格
    public int updateCarLogDis(@Param(value = "uuid") String uuid,@Param(value = "discount") int discount);

    //根据地址查询在场车辆已存在相同地址的车位数
    public int countCarPresentAddress(HandCar carlog);

    //获取地址
    public String getCarownerAddress(HandCar carlog);


}
