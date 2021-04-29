package com.demo.parking_access.handEntity;

public class HandCar {

    private String uuid;
    private String orgUuid;

    //对接进场
    private String parkid;
    private String gateUuid;
    private int time;
    private String picUrl;
    private String license;
    private int carType;
    private int payTime;

    private String address;
    private int version;


    private String parentId; //二级

    //无牌车对接
    private String wuLicense;
    private String openId;



    public HandCar(){

    }

    public HandCar(String parkid, String gateUuid, int time, String picUrl) {
        this.parkid = parkid;
        this.gateUuid = gateUuid;
        this.time = time;
        this.picUrl = picUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }

    public String getOpenId() {
        return openId;
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

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWuLicense() {
        return wuLicense;
    }

    public void setWuLicense(String wuLicense) {
        this.wuLicense = wuLicense;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
        if (this.license != null) this.license = this.license.replaceAll(" ", "");
    }

    public String getOrgUuid() {
        return orgUuid;
    }

    public void setOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
    }
}
