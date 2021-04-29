package com.demo.parking_access.entity;

public class Park {

    private int id;
    private String uuid;
    private String parkId;
    private String jjwparkId;
    private String secret;
    private String name;
    private int capcity;
    private int maxCapcity;
    private String address;
    private String managerUuid;
    private String orguuid;
    private String province;
    private String city;
    private String district;
    private String baseRentTollSolutionUuid;
    private String baseTempTollSolutionUuid;
    private String wpAppid; //公众号
    private String wpAppsecret; //公众号密码
    private String wpMrchid; //商户号
    private String wpApicert; //商户秘钥
    private String alipayAppid;
    private String alipayPublicKey;
    private String alipayPrivateKey;
    private String appId;
    private String appSecret;
    private int JJWFlag;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public int getJJWFlag() {
        return JJWFlag;
    }

    public void setJJWFlag(int JJWFlag) {
        this.JJWFlag = JJWFlag;
    }

    public String getJjwparkId() {
        return jjwparkId;
    }

    public void setJjwparkId(String jjwparkId) {
        this.jjwparkId = jjwparkId;
    }

    public String getAlipayAppid() {
        return alipayAppid;
    }

    public void setAlipayAppid(String alipayAppid) {
        this.alipayAppid = alipayAppid;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    public String getAlipayPrivateKey() {
        return alipayPrivateKey;
    }

    public void setAlipayPrivateKey(String alipayPrivateKey) {
        this.alipayPrivateKey = alipayPrivateKey;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getCapcity() {
        return capcity;
    }

    public void setCapcity(int capcity) {
        this.capcity = capcity;
    }

    public int getMaxCapcity() {
        return maxCapcity;
    }

    public void setMaxCapcity(int maxCapcity) {
        this.maxCapcity = maxCapcity;
    }

    public String getManagerUuid() {
        return managerUuid;
    }

    public void setManagerUuid(String managerUuid) {
        this.managerUuid = managerUuid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBaseRentTollSolutionUuid() {
        return baseRentTollSolutionUuid;
    }

    public void setBaseRentTollSolutionUuid(String baseRentTollSolutionUuid) {
        this.baseRentTollSolutionUuid = baseRentTollSolutionUuid;
    }

    public String getBaseTempTollSolutionUuid() {
        return baseTempTollSolutionUuid;
    }

    public void setBaseTempTollSolutionUuid(String baseTempTollSolutionUuid) {
        this.baseTempTollSolutionUuid = baseTempTollSolutionUuid;
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

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrguuid() {
        return orguuid;
    }

    public void setOrguuid(String orguuid) {
        this.orguuid = orguuid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWpAppid() {
        return wpAppid;
    }

    public void setWpAppid(String wpAppid) {
        this.wpAppid = wpAppid;
    }

    public String getWpAppsecret() {
        return wpAppsecret;
    }

    public void setWpAppsecret(String wpAppsecret) {
        this.wpAppsecret = wpAppsecret;
    }

    public String getWpMrchid() {
        return wpMrchid;
    }

    public void setWpMrchid(String wpMrchid) {
        this.wpMrchid = wpMrchid;
    }

    public String getWpApicert() {
        return wpApicert;
    }

    public void setWpApicert(String wpApicert) {
        this.wpApicert = wpApicert;
    }
}
