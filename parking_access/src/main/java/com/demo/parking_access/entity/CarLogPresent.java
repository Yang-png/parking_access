package com.demo.parking_access.entity;

import java.math.BigDecimal;

/**
 * 在场车辆
 */
public class CarLogPresent {

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
    private int dat;
    private int logTime;
    private String carlogcol;
    private int enterStatus; //进入状态
    private int exitStatus; //出去状态
    private int payTime;
    private int appendAmount;
    private int appendPayTime;
    private int appendPaid; //是否支付
    private int wtDiscount; //是否优惠
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

    private int countNums; //对接时统计在场车辆

    private Gate gate;
    private Worker worker;
    private CarType car;
    private Company company;

    private String stateIn;
    private String stateOut; //进出场状态
    private String address;
    private int version;
    private String parentId; //二级


    private String nextName;

    //对接
    private String startTime; //开始时间
    private String endTime;
    private String parkid;
    private int PageNo;
    private int PageSize;

    //reids  优惠时间
    private int freeTime;
    private int timeLong;


    public CarLogPresent() {
    }

    public CarLogPresent(String parkUuid,String license) {
        this.parkUuid = parkUuid;
        this.license = license;
    }

    public CarLogPresent( int freeTime, int timeLong, int enterTime, int exitTime, String parkUuid,String license) {
        this.license = license;
        this.enterTime = enterTime;
        this.exitTime = exitTime;
        this.parkUuid = parkUuid;
        this.freeTime = freeTime;
        this.timeLong = timeLong;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }

    public int getTimeLong() {
        return timeLong;
    }

    public void setTimeLong(int timeLong) {
        this.timeLong = timeLong;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getWtDiscount() {
        return wtDiscount;
    }

    public void setWtDiscount(int wtDiscount) {
        this.wtDiscount = wtDiscount;
    }

    public String getNextName() {
        return nextName;
    }

    public void setNextName(String nextName) {
        this.nextName = nextName;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public int getCountNums() {
        return countNums;
    }

    public void setCountNums(int countNums) {
        this.countNums = countNums;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public String getStateIn() {
        return stateIn;
    }

    public void setStateIn(String stateIn) {
        this.stateIn = stateIn;
    }

    public String getStateOut() {
        return stateOut;
    }

    public void setStateOut(String stateOut) {
        this.stateOut = stateOut;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
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

    public int getDat() {
        return dat;
    }

    public void setDat(int dat) {
        this.dat = dat;
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
}
