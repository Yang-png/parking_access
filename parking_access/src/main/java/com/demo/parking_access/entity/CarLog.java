package com.demo.parking_access.entity;

import java.math.BigDecimal;

/**
 * 车辆进出记录
 */
public class CarLog {

    private int id;
    private String uuid;
    private String license;
    private int carType; //车辆类型
    private String enterGateUuid;//进口uuid
    private String exitGateUuid;//出口uuid
    private int enterTime; //进入时间
    private int exitTime; //出去时间
    private String parkUuid;
    private String orgUuid;
    private BigDecimal amount; //收费
    private BigDecimal paidAmount; //支付收费
    private String workerUuid;
    private int paid; //是否支付
    private int payMethod; //支付方式
    private int year;
    private int month;
    private int day;
    private int logTime;
    private String carlogcol;
    private int enterStatus; //进入状态
    private int exitStatus; //出去状态
    private int payTime;
    private int appendAmount;
    private int appendPayTime;
    private int appendPaid; //是否支付
    private int discount; //优惠
    private String discountWorkerUuid;
    private String provider;
    private String proof;
    private String remark;
    private int carModal;
    private String color;
    private int lastUpdateTime;
    private String tradeNo;
    private String appendTradeNo;
    private int appendPayMethod;
    private String payResp;
    private String lastEnterGateUuid;
    private String enterPicUrl;
    private String outPicUrl;

    private Gate gate;
    private Worker worker;
    private CarType car;

    private String stateIn;
    private String stateOut; //进出场状态



    //对接数据
    private String parkid;  //license
    private String gateUuid;
    private int time;
    private String picUrl;
    private int confidence;


    //出场
    private String logUuid;

    private Long timeLong;
    private int gate_level;
    private int original_amount;
    private int carModel;
    private Boolean already_paid;
    private int status;

    private String nextName;

    private String parentId; //二级


    public static final int PAY_METHOD_CASH = 1; //现金
    public static final int PAY_METHOD_ALIPAY = 2; //支付宝线下
    public static final int PAY_METHOD_WECHAT = 3; //微信支付线下
    public static final int PAY_METHOD_PERIOD_RENT = 4; //月租支付
    public static final int PAY_METHOD_STORED_VALUE = 5;//储值卡
    public static final int PAY_METHOD_WECHAT_SELF = 6; //微信自助缴费
    public static final int PAY_METHOD_FREE = 9; //免费

    public static final String PAY_METHOD_DXY = "dxy"; //免费

    public static final int STATUS_UNDEFINED = -1; //未定义或无状态
    public static final int STATUS_NORMAL = 0; //正常，等待缴费离场
    public static final int STATUS_RENT_PERIOD_EXPIRED = 1;//月租或时租到期
    public static final int STATUS_ARREARS = 2;//欠费或（储值卡）余额不足
    public static final int STATUS_LEAVE_TIME_EXPIRED = 3;//未在规定时间内离场，加付金额
    public static final int STATUS_CONFLICT_LOG = 4;//没有进场记录，重复离场  勿重复进场
    public static final int STATUS_FREE = 5;//免费车，自动开闸放行
    public static final int STATUS_TICKET = 6;//预留状态，停车抵用券卡
    public static final int STATUS_OUTOF_TIME_LIMIT = 7;//超限时停车
    public static final int STATUS_BLACKLIST = 8;//预留状态，黑名单
    public static final int STATUS_NO_CUSTOMER = 9;//预留状态，非本场用户车辆，禁止出入场
    public static final int STATUS_PAYDONE = 10;//已支付
    public static final int STATUS_BALANCE_NOT_ENOUGH = 11;       //余额不足
    public static final int STATUS_MANUALLY_OPEN_GATE = 17;       //人工开闸
    public static final int STATUS_VIP = 18;                      //预留状态，VIP车
    public static final int STATUS_NO_TOLL_SOLUTION = 19;         //闸口未绑定任何计费方案
    public static final int STATUS_ERR = 20;                      //系统错误




    public CarLog() {
    }

    public CarLog(String parkUuid,String license) {
        this.parkUuid = parkUuid;
        this.license = license;
    }

    public CarLog(int id, String uuid, String license, int carType, String enterGateUuid, String exitGateUuid, int enterTime, int exitTime, String parkUuid, String orgUuid, BigDecimal amount, BigDecimal paidAmount, String workerUuid, int paid, int payMethod, int year, int month, int day, int logTime, String carlogcol, int enterStatus, int exitStatus, int payTime, int appendAmount, int appendPayTime, int appendPaid, int discount, String discountWorkerUuid, String provider, String proof, String remark, int carModal, String color, int lastUpdateTime, String tradeNo, String appendTradeNo, int appendPayMethod, String payResp, String lastEnterGateUuid, String enterPicUrl, String outPicUrl) {
        this.id = id;
        this.uuid = uuid;
        this.license = license;
        this.carType = carType;
        this.enterGateUuid = enterGateUuid;
        this.exitGateUuid = exitGateUuid;
        this.enterTime = enterTime;
        this.exitTime = exitTime;
        this.parkUuid = parkUuid;
        this.orgUuid = orgUuid;
        this.amount = amount;
        this.paidAmount = paidAmount;
        this.workerUuid = workerUuid;
        this.paid = paid;
        this.payMethod = payMethod;
        this.year = year;
        this.month = month;
        this.day = day;
        this.logTime = logTime;
        this.carlogcol = carlogcol;
        this.enterStatus = enterStatus;
        this.exitStatus = exitStatus;
        this.payTime = payTime;
        this.appendAmount = appendAmount;
        this.appendPayTime = appendPayTime;
        this.appendPaid = appendPaid;
        this.discount = discount;
        this.discountWorkerUuid = discountWorkerUuid;
        this.provider = provider;
        this.proof = proof;
        this.remark = remark;
        this.carModal = carModal;
        this.color = color;
        this.lastUpdateTime = lastUpdateTime;
        this.tradeNo = tradeNo;
        this.appendTradeNo = appendTradeNo;
        this.appendPayMethod = appendPayMethod;
        this.payResp = payResp;
        this.lastEnterGateUuid = lastEnterGateUuid;
        this.enterPicUrl = enterPicUrl;
        this.outPicUrl = outPicUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getNextName() {
        return nextName;
    }

    public void setNextName(String nextName) {
        this.nextName = nextName;
    }

    public int getCarModel() {
        return carModel;
    }

    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }

    public String getLogUuid() {
        return logUuid;
    }

    public void setLogUuid(String logUuid) {
        this.logUuid = logUuid;
    }

    public Long getTimeLong() {
        return timeLong;
    }

    public void setTimeLong(Long timeLong) {
        this.timeLong = timeLong;
    }

    public int getGate_level() {
        return gate_level;
    }

    public void setGate_level(int gate_level) {
        this.gate_level = gate_level;
    }

    public int getOriginal_amount() {
        return original_amount;
    }

    public void setOriginal_amount(int original_amount) {
        this.original_amount = original_amount;
    }

    public Boolean getAlready_paid() {
        return already_paid;
    }

    public void setAlready_paid(Boolean already_paid) {
        this.already_paid = already_paid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getGateUuid() {
        return gateUuid;
    }

    public void setGateUuid(String gateUuid) {
        this.gateUuid = gateUuid;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getStateOut() {
        return stateOut;
    }

    public void setStateOut(String stateOut) {
        this.stateOut = stateOut;
    }

    public String getStateIn() {
        return stateIn;
    }

    public void setStateIn(String stateIn) {
        this.stateIn = stateIn;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public CarType getCar() {
        return car;
    }

    public void setCar(CarType car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public String getEnterGateUuid() {
        return enterGateUuid;
    }

    public void setEnterGateUuid(String enterGateUuid) {
        this.enterGateUuid = enterGateUuid;
    }

    public String getExitGateUuid() {
        return exitGateUuid;
    }

    public void setExitGateUuid(String exitGateUuid) {
        this.exitGateUuid = exitGateUuid;
    }

    public int getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(int enterTime) {
        this.enterTime = enterTime;
    }

    public int getExitTime() {
        return exitTime;
    }

    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }

    public String getParkUuid() {
        return parkUuid;
    }

    public void setParkUuid(String parkUuid) {
        this.parkUuid = parkUuid;
    }

    public String getOrgUuid() {
        return orgUuid;
    }

    public void setOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getWorkerUuid() {
        return workerUuid;
    }

    public void setWorkerUuid(String workerUuid) {
        this.workerUuid = workerUuid;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(int payMethod) {
        this.payMethod = payMethod;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getLogTime() {
        return logTime;
    }

    public void setLogTime(int logTime) {
        this.logTime = logTime;
    }

    public String getCarlogcol() {
        return carlogcol;
    }

    public void setCarlogcol(String carlogcol) {
        this.carlogcol = carlogcol;
    }

    public int getEnterStatus() {
        return enterStatus;
    }

    public void setEnterStatus(int enterStatus) {
        this.enterStatus = enterStatus;
    }

    public int getExitStatus() {
        return exitStatus;
    }

    public void setExitStatus(int exitStatus) {
        this.exitStatus = exitStatus;
    }

    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }

    public int getAppendAmount() {
        return appendAmount;
    }

    public void setAppendAmount(int appendAmount) {
        this.appendAmount = appendAmount;
    }

    public int getAppendPayTime() {
        return appendPayTime;
    }

    public void setAppendPayTime(int appendPayTime) {
        this.appendPayTime = appendPayTime;
    }

    public int getAppendPaid() {
        return appendPaid;
    }

    public void setAppendPaid(int appendPaid) {
        this.appendPaid = appendPaid;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDiscountWorkerUuid() {
        return discountWorkerUuid;
    }

    public void setDiscountWorkerUuid(String discountWorkerUuid) {
        this.discountWorkerUuid = discountWorkerUuid;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCarModal() {
        return carModal;
    }

    public void setCarModal(int carModal) {
        this.carModal = carModal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(int lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getAppendTradeNo() {
        return appendTradeNo;
    }

    public void setAppendTradeNo(String appendTradeNo) {
        this.appendTradeNo = appendTradeNo;
    }

    public int getAppendPayMethod() {
        return appendPayMethod;
    }

    public void setAppendPayMethod(int appendPayMethod) {
        this.appendPayMethod = appendPayMethod;
    }

    public String getPayResp() {
        return payResp;
    }

    public void setPayResp(String payResp) {
        this.payResp = payResp;
    }

    public String getLastEnterGateUuid() {
        return lastEnterGateUuid;
    }

    public void setLastEnterGateUuid(String lastEnterGateUuid) {
        this.lastEnterGateUuid = lastEnterGateUuid;
    }

    public String getEnterPicUrl() {
        return enterPicUrl;
    }

    public void setEnterPicUrl(String enterPicUrl) {
        this.enterPicUrl = enterPicUrl;
    }

    public String getOutPicUrl() {
        return outPicUrl;
    }

    public void setOutPicUrl(String outPicUrl) {
        this.outPicUrl = outPicUrl;
    }

    @Override
    public String toString() {
        return "CarLog{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", license='" + license + '\'' +
                ", carType=" + carType +
                ", enterGateUuid='" + enterGateUuid + '\'' +
                ", exitGateUuid='" + exitGateUuid + '\'' +
                ", enterTime=" + enterTime +
                ", exitTime=" + exitTime +
                ", parkUuid='" + parkUuid + '\'' +
                ", orgUuid='" + orgUuid + '\'' +
                ", amount=" + amount +
                ", paidAmount=" + paidAmount +
                ", workerUuid='" + workerUuid + '\'' +
                ", paid=" + paid +
                ", payMethod=" + payMethod +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", logTime=" + logTime +
                ", carlogcol='" + carlogcol + '\'' +
                ", enterStatus=" + enterStatus +
                ", exitStatus=" + exitStatus +
                ", payTime=" + payTime +
                ", appendAmount=" + appendAmount +
                ", appendPayTime=" + appendPayTime +
                ", appendPaid=" + appendPaid +
                ", discount=" + discount +
                ", discountWorkerUuid='" + discountWorkerUuid + '\'' +
                ", provider='" + provider + '\'' +
                ", proof='" + proof + '\'' +
                ", remark='" + remark + '\'' +
                ", carModal=" + carModal +
                ", color='" + color + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", tradeNo='" + tradeNo + '\'' +
                ", appendTradeNo='" + appendTradeNo + '\'' +
                ", appendPayMethod=" + appendPayMethod +
                ", payResp='" + payResp + '\'' +
                ", lastEnterGateUuid='" + lastEnterGateUuid + '\'' +
                ", enterPicUrl='" + enterPicUrl + '\'' +
                ", outPicUrl='" + outPicUrl + '\'' +
                ", gate=" + gate +
                ", worker=" + worker +
                ", car=" + car +
                ", stateIn='" + stateIn + '\'' +
                ", stateOut='" + stateOut + '\'' +
                ", parkid='" + parkid + '\'' +
                ", gateUuid='" + gateUuid + '\'' +
                ", time=" + time +
                ", picUrl='" + picUrl + '\'' +
                ", confidence=" + confidence +
                ", logUuid='" + logUuid + '\'' +
                ", timeLong=" + timeLong +
                ", gate_level=" + gate_level +
                ", original_amount=" + original_amount +
                ", carModel=" + carModel +
                ", already_paid=" + already_paid +
                ", status=" + status +
                ", nextName='" + nextName + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
