package com.demo.parking_access.entity;

import java.math.BigDecimal;

public class Feeplan {

    private String uuid;
    private int id;
    private int timeUnit; //收费设置 x（小时，分钟）
    private int unitType; //收费设置 代表时间分,时,天等 时为2
    private BigDecimal amount; //收费金额
    private int ladderPricing; //是否开启阶梯收费
    private String workerUuid;
    private int regDate;
    private BigDecimal dailyLimitAmount;
    private String soluUuid;
    private int nighttime; //日间or夜晚  0 or 1

    public Feeplan(){

    }

    public Feeplan(int id, int timeUnit, int unitType, BigDecimal amount, int ladderPricing, String workerUuid, int regDate, BigDecimal dailyLimitAmount, String soluUuid, int nighttime) {
        this.id = id;
        this.timeUnit = timeUnit;
        this.unitType = unitType;
        this.amount = amount;
        this.ladderPricing = ladderPricing;
        this.workerUuid = workerUuid;
        this.regDate = regDate;
        this.dailyLimitAmount = dailyLimitAmount;
        this.soluUuid = soluUuid;
        this.nighttime = nighttime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(int timeUnit) {
        this.timeUnit = timeUnit;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getLadderPricing() {
        return ladderPricing;
    }

    public void setLadderPricing(int ladderPricing) {
        this.ladderPricing = ladderPricing;
    }

    public String getWorkerUuid() {
        return workerUuid;
    }

    public void setWorkerUuid(String workerUuid) {
        this.workerUuid = workerUuid;
    }

    public int getRegDate() {
        return regDate;
    }

    public void setRegDate(int regDate) {
        this.regDate = regDate;
    }

    public BigDecimal getDailyLimitAmount() {
        return dailyLimitAmount;
    }

    public void setDailyLimitAmount(BigDecimal dailyLimitAmount) {
        this.dailyLimitAmount = dailyLimitAmount;
    }

    public String getSoluUuid() {
        return soluUuid;
    }

    public void setSoluUuid(String soluUuid) {
        this.soluUuid = soluUuid;
    }

    public int getNighttime() {
        return nighttime;
    }

    public void setNighttime(int nighttime) {
        this.nighttime = nighttime;
    }
}
