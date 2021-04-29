package com.demo.parking_access.entity;

import java.math.BigDecimal;

/**
 * 临时车等收费记录
 */
public class PayLog {

    private int id;
    private String uuid;
    private String logUuid;
    private String license;
    private BigDecimal amount;
    private int payMethod; //收费方式
    private String remark; //备注
    private int payTime; //收费时间戳
    private String parkUuid;
    private String orgUuid;
    private String workerUuid;

    private String payName; //交费方式
    private String workerName;//操作员名称 暂存
    private int payTime2; //付款结束时间 暂存

    private CarLog carLog;
    private Worker worker;
    private BigDecimal sum; //缴费总价

    //对接数据 logUuid license workerUuid amount
    private String parkid;
    private String gateUuid;
    private int time;

    private String nextName;



    public PayLog() {
    }

    public PayLog(int id, String uuid, String logUuid, String license, BigDecimal amount, int payMethod, String remark, int payTime, String parkUuid, String orgUuid, String workerUuid) {
        this.id = id;
        this.uuid = uuid;
        this.logUuid = logUuid;
        this.license = license;
        this.amount = amount;
        this.payMethod = payMethod;
        this.remark = remark;
        this.payTime = payTime;
        this.parkUuid = parkUuid;
        this.orgUuid = orgUuid;
        this.workerUuid = workerUuid;
    }

    public String getNextName() {
        return nextName;
    }

    public void setNextName(String nextName) {
        this.nextName = nextName;
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

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public int getPayTime2() {
        return payTime2;
    }

    public void setPayTime2(int payTime2) {
        this.payTime2 = payTime2;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public CarLog getCarLog() {
        return carLog;
    }

    public void setCarLog(CarLog carLog) {
        this.carLog = carLog;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(int payMethod) {
        this.payMethod = payMethod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
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

    public String getWorkerUuid() {
        return workerUuid;
    }

    public void setWorkerUuid(String workerUuid) {
        this.workerUuid = workerUuid;
    }
}
