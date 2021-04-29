package com.demo.parking_access.entity;

public class NullCarOut {

    private int id;
    private String uuid;
    private String openId;
    private String gateUuid;
    private int amount;
    private int time;
    private String parkUuid;

    public NullCarOut(){

    }

    public NullCarOut(String uuid, String openId, String gateUuid, int time) {
        this.uuid = uuid;
        this.openId = openId;
        this.gateUuid = gateUuid;
        this.time = time;
    }

    public String getParkUuid() {
        return parkUuid;
    }

    public void setParkUuid(String parkUuid) {
        this.parkUuid = parkUuid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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
}
