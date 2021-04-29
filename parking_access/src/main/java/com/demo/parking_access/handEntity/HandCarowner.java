package com.demo.parking_access.handEntity;

public class HandCarowner {

    private String license;
    private String parkid;
    private int carType;
    private long endDate;
    private Double card_amount;

    public HandCarowner(){

    }

    public HandCarowner(String license, String parkid, int carType, long endDate, Double card_amount) {
        this.license = license;
        this.parkid = parkid;
        this.carType = carType;
        this.endDate = endDate;
        this.card_amount = card_amount;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }


    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public Double getCard_amount() {
        return card_amount;
    }

    public void setCard_amount(Double card_amount) {
        this.card_amount = card_amount;
    }
}
