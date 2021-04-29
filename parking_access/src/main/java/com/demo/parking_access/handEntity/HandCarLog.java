package com.demo.parking_access.handEntity;


/**
 * 车辆出场时删除在场车辆 记录出场记录 记录付款记录类
 */
public class HandCarLog {

    private String logUuid;
    private String license;
    private String workerUuid;
    private Double amount;
    private long time;  //出场时间
    private String gateUuid;
    private String parkid;
    private String description; //正常
    private String remark;


    private String uuid; //生成付款uuid
    private String orgUuid;//付款记录公司uuid
    private int payMethod; //付款方式
    private int carType;
    private String picUrl;

    //无牌车
    private String openId;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public int getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(int payMethod) {
        this.payMethod = payMethod;
    }

    public String getOrgUuid() {
        return orgUuid;
    }

    public void setOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLogUuid() {
        return logUuid;
    }

    public void setLogUuid(String logUuid) {
        this.logUuid = logUuid;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getWorkerUuid() {
        return workerUuid;
    }

    public void setWorkerUuid(String workerUuid) {
        this.workerUuid = workerUuid;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getGateUuid() {
        return gateUuid;
    }

    public void setGateUuid(String gateUuid) {
        this.gateUuid = gateUuid;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "HandCarLog{" +
                "logUuid='" + logUuid + '\'' +
                ", license='" + license + '\'' +
                ", workerUuid='" + workerUuid + '\'' +
                ", amount=" + amount +
                ", time=" + time +
                ", gateUuid='" + gateUuid + '\'' +
                ", parkid='" + parkid + '\'' +
                ", description='" + description + '\'' +
                ", remark='" + remark + '\'' +
                ", uuid='" + uuid + '\'' +
                ", orgUuid='" + orgUuid + '\'' +
                ", payMethod=" + payMethod +
                ", carType=" + carType +
                ", picUrl='" + picUrl + '\'' +
                ", openId='" + openId + '\'' +
                '}';
    }
}
