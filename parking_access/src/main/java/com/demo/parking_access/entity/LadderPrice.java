package com.demo.parking_access.entity;

import java.math.BigDecimal;

public class LadderPrice {

    private int id;
    private String uuid;
    private String planUuid;
    private String soluUuid;
    private int ladderAfterTimeUnit;//10（小时，分钟）
    private int ladderAfterTimeUnitType; // 2   代表时间分,时,天等 时为2
    private int ladderTimeUnit;//1（小时，分钟）
    private int ladderUnitType;// 2  代表时间分,时,天等 时为2
    private BigDecimal ladderAmount; // 600 收费   例如超10小时每1小时收600元
    private int orderSeed;

    public LadderPrice() {

    }

    public LadderPrice(int id, String planUuid, String soluUuid, int ladderAfterTimeUnit, int ladderAfterTimeUnitType, int ladderTimeUnit, int ladderUnitType, BigDecimal ladderAmount, int orderSeed) {
        this.id = id;
        this.planUuid = planUuid;
        this.soluUuid = soluUuid;
        this.ladderAfterTimeUnit = ladderAfterTimeUnit;
        this.ladderAfterTimeUnitType = ladderAfterTimeUnitType;
        this.ladderTimeUnit = ladderTimeUnit;
        this.ladderUnitType = ladderUnitType;
        this.ladderAmount = ladderAmount;
        this.orderSeed = orderSeed;
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

    public String getPlanUuid() {
        return planUuid;
    }

    public void setPlanUuid(String planUuid) {
        this.planUuid = planUuid;
    }

    public String getSoluUuid() {
        return soluUuid;
    }

    public void setSoluUuid(String soluUuid) {
        this.soluUuid = soluUuid;
    }

    public int getLadderAfterTimeUnit() {
        return ladderAfterTimeUnit;
    }

    public void setLadderAfterTimeUnit(int ladderAfterTimeUnit) {
        this.ladderAfterTimeUnit = ladderAfterTimeUnit;
    }

    public int getLadderAfterTimeUnitType() {
        return ladderAfterTimeUnitType;
    }

    public void setLadderAfterTimeUnitType(int ladderAfterTimeUnitType) {
        this.ladderAfterTimeUnitType = ladderAfterTimeUnitType;
    }

    public int getLadderTimeUnit() {
        return ladderTimeUnit;
    }

    public void setLadderTimeUnit(int ladderTimeUnit) {
        this.ladderTimeUnit = ladderTimeUnit;
    }

    public int getLadderUnitType() {
        return ladderUnitType;
    }

    public void setLadderUnitType(int ladderUnitType) {
        this.ladderUnitType = ladderUnitType;
    }

    public BigDecimal getLadderAmount() {
        return ladderAmount;
    }

    public void setLadderAmount(BigDecimal ladderAmount) {
        this.ladderAmount = ladderAmount;
    }

    public int getOrderSeed() {
        return orderSeed;
    }

    public void setOrderSeed(int orderSeed) {
        this.orderSeed = orderSeed;
    }
}
