package com.demo.parking_access.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Feesolution {

    private int id;
    private String uuid;
    private int wholeDay; //1代表全天 0分日夜
    private String name;
    private int carType;//车辆类型 没有表
    private String parkUuid;
    private String orgUuid;
    private int scopeType;
    private BigDecimal maxAmount;
    private Integer freeTime;
    private int freeForPM; //军官 tinyint
    private int dayTimeStart;
    private int dayTimeEnd;
    private String workerUuid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regDate;
    private BigDecimal dailyLimitAmount;
    private int freeTimeUnit;
    private int freeTimeUnitType;
    private int leaveAfterPaymentInMins;

    private List<Feeplan> feeplanList; //收费设置数据
    private List<LadderPrice> ladderPriceList; //阶梯设置表



    //收费设置
    private int timeUnit; //收费设置 x（小时，分钟）
    private int unitType; //收费设置 代表时间分,时,天等 时为2
    private BigDecimal amount; //收费金额
    private int ladderPricing; //是否开启阶梯收费

    private int timeUnitYe; //收费设置 x（小时，分钟）
    private int unitTypeYe; //收费设置 代表时间分,时,天等 时为2
    private BigDecimal amountYe; //收费金额
    private int ladderPricingYe; //是否开启阶梯收费


    //阶梯设置
    private int ladderAfterTimeUnit;//10（小时，分钟）
    private int ladderAfterTimeUnitType; // 2   代表时间分,时,天等 时为2
    private int ladderTimeUnit;//1（小时，分钟）
    private int ladderUnitType;// 2  代表时间分,时,天等 时为2
    private BigDecimal ladderAmount; // 600 收费   例如超10小时每1小时收600元

    private int ladderAfterTimeUnitYe;//10（小时，分钟）
    private int ladderAfterTimeUnitTypeYe; // 2   代表时间分,时,天等 时为2
    private int ladderTimeUnitYe;//1（小时，分钟）
    private int ladderUnitTypeYe;// 2  代表时间分,时,天等 时为2
    private BigDecimal ladderAmountYe; // 600 收费   例如超10小时每1小时收600元

    private String planUuid; //收费uuid
    private String planUuidYe; //收费uuid
    private String laddUuid; //阶梯uuid



    private Company company;
    private String dayType; //黑夜白昼 暂存取值

    //便捷方案时存储的方案阶梯集合
    private List<LadderPrice> jtsf; //阶梯设置表
    private List<LadderPrice> jtsfYe;

    public Feesolution() {
    }

    public Feesolution(String parkUuid) {
        this.parkUuid = parkUuid;
    }

    public Feesolution(int id, String uuid, int wholeDay, String name, int carType, String parkUuid, String orgUuid, int scopeType, BigDecimal maxAmount, int freeForPM, int dayTimeStart, int dayTimeEnd, String workerUuid, Date regDate, BigDecimal dailyLimitAmount, int freeTimeUnit, int freeTimeUnitType, int leaveAfterPaymentInMins) {
        this.id = id;
        this.uuid = uuid;
        this.wholeDay = wholeDay;
        this.name = name;
        this.carType = carType;
        this.parkUuid = parkUuid;
        this.orgUuid = orgUuid;
        this.scopeType = scopeType;
        this.maxAmount = maxAmount;
        this.freeForPM = freeForPM;
        this.dayTimeStart = dayTimeStart;
        this.dayTimeEnd = dayTimeEnd;
        this.workerUuid = workerUuid;
        this.regDate = regDate;
        this.dailyLimitAmount = dailyLimitAmount;
        this.freeTimeUnit = freeTimeUnit;
        this.freeTimeUnitType = freeTimeUnitType;
        this.leaveAfterPaymentInMins = leaveAfterPaymentInMins;
    }

    public Integer getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Integer freeTime) {
        this.freeTime = freeTime;
    }

    public List<LadderPrice> getJtsf() {
        return jtsf;
    }

    public void setJtsf(List<LadderPrice> jtsf) {
        this.jtsf = jtsf;
    }

    public List<LadderPrice> getJtsfYe() {
        return jtsfYe;
    }

    public void setJtsfYe(List<LadderPrice> jtsfYe) {
        this.jtsfYe = jtsfYe;
    }

    public List<Feeplan> getFeeplanList() {
        return feeplanList;
    }

    public void setFeeplanList(List<Feeplan> feeplanList) {
        this.feeplanList = feeplanList;
    }

    public List<LadderPrice> getLadderPriceList() {
        return ladderPriceList;
    }

    public void setLadderPriceList(List<LadderPrice> ladderPriceList) {
        this.ladderPriceList = ladderPriceList;
    }

    public String getPlanUuidYe() {
        return planUuidYe;
    }

    public void setPlanUuidYe(String planUuidYe) {
        this.planUuidYe = planUuidYe;
    }

    public String getPlanUuid() {
        return planUuid;
    }

    public void setPlanUuid(String planUuid) {
        this.planUuid = planUuid;
    }

    public String getLaddUuid() {
        return laddUuid;
    }

    public void setLaddUuid(String laddUuid) {
        this.laddUuid = laddUuid;
    }

    public int getLadderPricing() {
        return ladderPricing;
    }

    public void setLadderPricing(int ladderPricing) {
        this.ladderPricing = ladderPricing;
    }

    public int getLadderPricingYe() {
        return ladderPricingYe;
    }

    public void setLadderPricingYe(int ladderPricingYe) {
        this.ladderPricingYe = ladderPricingYe;
    }

    public int getLadderAfterTimeUnitYe() {
        return ladderAfterTimeUnitYe;
    }

    public void setLadderAfterTimeUnitYe(int ladderAfterTimeUnitYe) {
        this.ladderAfterTimeUnitYe = ladderAfterTimeUnitYe;
    }

    public int getLadderAfterTimeUnitTypeYe() {
        return ladderAfterTimeUnitTypeYe;
    }

    public void setLadderAfterTimeUnitTypeYe(int ladderAfterTimeUnitTypeYe) {
        this.ladderAfterTimeUnitTypeYe = ladderAfterTimeUnitTypeYe;
    }

    public int getLadderTimeUnitYe() {
        return ladderTimeUnitYe;
    }

    public void setLadderTimeUnitYe(int ladderTimeUnitYe) {
        this.ladderTimeUnitYe = ladderTimeUnitYe;
    }

    public int getLadderUnitTypeYe() {
        return ladderUnitTypeYe;
    }

    public void setLadderUnitTypeYe(int ladderUnitTypeYe) {
        this.ladderUnitTypeYe = ladderUnitTypeYe;
    }

    public BigDecimal getLadderAmountYe() {
        return ladderAmountYe;
    }

    public void setLadderAmountYe(BigDecimal ladderAmountYe) {
        this.ladderAmountYe = ladderAmountYe;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public BigDecimal getDailyLimitAmount() {
        return dailyLimitAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public void setDailyLimitAmount(BigDecimal dailyLimitAmount) {
        this.dailyLimitAmount = dailyLimitAmount;
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

    public int getTimeUnitYe() {
        return timeUnitYe;
    }

    public void setTimeUnitYe(int timeUnitYe) {
        this.timeUnitYe = timeUnitYe;
    }

    public int getUnitTypeYe() {
        return unitTypeYe;
    }

    public void setUnitTypeYe(int unitTypeYe) {
        this.unitTypeYe = unitTypeYe;
    }

    public BigDecimal getAmountYe() {
        return amountYe;
    }

    public void setAmountYe(BigDecimal amountYe) {
        this.amountYe = amountYe;
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

    public String getDayType() {
        return dayType;
    }

    public void setDayType(String dayType) {
        this.dayType = dayType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public int getWholeDay() {
        return wholeDay;
    }

    public void setWholeDay(int wholeDay) {
        this.wholeDay = wholeDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
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

    public int getScopeType() {
        return scopeType;
    }

    public void setScopeType(int scopeType) {
        this.scopeType = scopeType;
    }


    public int getFreeForPM() {
        return freeForPM;
    }

    public void setFreeForPM(int freeForPM) {
        this.freeForPM = freeForPM;
    }

    public int getDayTimeStart() {
        return dayTimeStart;
    }

    public void setDayTimeStart(int dayTimeStart) {
        this.dayTimeStart = dayTimeStart;
    }

    public int getDayTimeEnd() {
        return dayTimeEnd;
    }

    public void setDayTimeEnd(int dayTimeEnd) {
        this.dayTimeEnd = dayTimeEnd;
    }

    public String getWorkerUuid() {
        return workerUuid;
    }

    public void setWorkerUuid(String workerUuid) {
        this.workerUuid = workerUuid;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }


    public int getFreeTimeUnit() {
        return freeTimeUnit;
    }

    public void setFreeTimeUnit(int freeTimeUnit) {
        this.freeTimeUnit = freeTimeUnit;
    }

    public int getFreeTimeUnitType() {
        return freeTimeUnitType;
    }

    public void setFreeTimeUnitType(int freeTimeUnitType) {
        this.freeTimeUnitType = freeTimeUnitType;
    }

    public int getLeaveAfterPaymentInMins() {
        return leaveAfterPaymentInMins;
    }

    public void setLeaveAfterPaymentInMins(int leaveAfterPaymentInMins) {
        this.leaveAfterPaymentInMins = leaveAfterPaymentInMins;
    }
}
