package com.demo.parking_access.handEntity;

import com.demo.parking_access.entity.CarLog;

public class HandPayLog {

    private String workerUuid;
    private String license;
    private int carType;
    private int payMethod;
    private String startTime;
    private String endTime;
    private String workerName;
    private String Username;
    private String parkid;
    private String logUuid;
    private int amount;
    private int payTime;
    private String remark;
    private String uuid;
    private String orgUuid;
    private String parkUuid;
    private int exitTime;
    private int id;
    private int paidAmount;
    private int enterTime;


    private CarLog carLog;

    public HandPayLog(){

    }

    public HandPayLog(String license, int carType, int payMethod, String startTime, String endTime, String workerName, String parkid, String logUuid, int amount, int payTime, String remark, String uuid, String orgUuid, String parkUuid, int exitTime, int id, int paidAmount, int enterTime) {
        this.license = license;
        this.carType = carType;
        this.payMethod = payMethod;
        this.startTime = startTime;
        this.endTime = endTime;
        this.workerName = workerName;
        this.parkid = parkid;
        this.logUuid = logUuid;
        this.amount = amount;
        this.payTime = payTime;
        this.remark = remark;
        this.uuid = uuid;
        this.orgUuid = orgUuid;
        this.parkUuid = parkUuid;
        this.exitTime = exitTime;
        this.id = id;
        this.paidAmount = paidAmount;
        this.enterTime = enterTime;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getWorkerUuid() {
        return workerUuid;
    }

    public void setWorkerUuid(String workerUuid) {
        this.workerUuid = workerUuid;
    }

    public CarLog getCarLog() {
        return carLog;
    }

    public void setCarLog(CarLog carLog) {
        this.carLog = carLog;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public int getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(int payMethod) {
        this.payMethod = payMethod;
    }


    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getLogUuid() {
        return logUuid;
    }

    public void setLogUuid(String logUuid) {
        this.logUuid = logUuid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrgUuid() {
        return orgUuid;
    }

    public void setOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
    }

    public String getParkUuid() {
        return parkUuid;
    }

    public void setParkUuid(String parkUuid) {
        this.parkUuid = parkUuid;
    }

    public int getExitTime() {
        return exitTime;
    }

    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public int getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(int enterTime) {
        this.enterTime = enterTime;
    }
}
