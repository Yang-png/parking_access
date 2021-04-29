package com.demo.parking_access.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 车主信息
 */
public class Carowner {


    @ExcelProperty(value = {"车主信息表", "车主姓名"})
    @ColumnWidth(20)
    private String name; //姓名

    @ExcelProperty(value = {"车主信息表", "车牌号码"})
    @ColumnWidth(20)
    private String license; //车牌号码

    @ExcelProperty(value = {"车主信息表", "电话号码"})
    @ColumnWidth(20)
    private String phone; //电话

    @ExcelProperty(value = {"车主信息表", "车辆类型"})
    @ColumnWidth(20)
    private String tyepName;  //车辆类型名称

    @ExcelProperty(value = {"车主信息表", "地址"})
    @ColumnWidth(20)
    private String address; //地址

    @ExcelProperty(value = {"车主信息表", "所属停车场"})
    @ColumnWidth(20)
    private String companyName; //上级单位名称

    @ExcelProperty(value = {"车主信息表", "备注"})
    @ColumnWidth(20)
    private String dep; //卡 部门


    @ExcelIgnore
    private String idcard; //身份证

    @ExcelIgnore
    private int carNums;  //拥有车辆数目

    @ExcelIgnore
    private int id;

    @ExcelIgnore
    private String uuid;  //编码

    @ExcelIgnore
    private String ownerUuid;

    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;  //起始时间

    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;  //结束时间

    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regDate;  //更新时间

    @ExcelIgnore
    private String spaceuuid;

    @ExcelIgnore
    private BigDecimal amount;

    @ExcelIgnore
    private String workerUuid; //操作员uuid

    @ExcelIgnore
    private String no;

    @ExcelIgnore
    private String feeSolutionUuid;

    @ExcelIgnore
    private String carUuid; //车辆uuid  未用


    @ExcelIgnore
    private int male; //性别

    @ExcelIgnore
    private int type; //车辆类型

    @ExcelIgnore
    private String orguuid; //所属公司

    @ExcelIgnore
    private String remark;

    @ExcelIgnore
    private String parkuuid; //上层组织编码

    @ExcelIgnore
    private String box;

    @ExcelIgnore
    private BigDecimal balance;

    @ExcelIgnore
    private BigDecimal lastBalance;

    @ExcelIgnore
    private int paymentNums;

    @ExcelIgnore
    private Company company;

    @ExcelIgnore
    private CarType carType;

    @ExcelIgnore
    private Worker worker;

  /*  @ExcelIgnore
    private Residents residents;*/

    @ExcelIgnore
    private List<CarType> carTypeList;

    @ExcelIgnore
    private List<Feesolution> feesolutionList;

    private String parkid;

    private int startDateInt;

    private int endDateInt;

    private int regDateInt;


    public Carowner() {

    }

    public Carowner(String parkuuid) {
        this.parkuuid = parkuuid;
    }

    public Carowner(int male, String name) {
        this.male = male;
        this.name = name;
    }

    public Carowner(String name, String license, String phone, String tyepName, String address, String companyName, String dep, String idcard, int carNums, int id, String uuid, String ownerUuid, Date startDate, Date endDate, Date regDate, String spaceuuid, BigDecimal amount, String workerUuid, String no, String feeSolutionUuid, String carUuid, int male, int type, String orguuid, String remark, String parkuuid, String box, BigDecimal balance, BigDecimal lastBalance, int paymentNums) {
        this.name = name;
        this.license = license;
        this.phone = phone;
        this.tyepName = tyepName;
        this.address = address;
        this.companyName = companyName;
        this.dep = dep;
        this.idcard = idcard;
        this.carNums = carNums;
        this.id = id;
        this.uuid = uuid;
        this.ownerUuid = ownerUuid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.regDate = regDate;
        this.spaceuuid = spaceuuid;
        this.amount = amount;
        this.workerUuid = workerUuid;
        this.no = no;
        this.feeSolutionUuid = feeSolutionUuid;
        this.carUuid = carUuid;
        this.male = male;
        this.type = type;
        this.orguuid = orguuid;
        this.remark = remark;
        this.parkuuid = parkuuid;
        this.box = box;
        this.balance = balance;
        this.lastBalance = lastBalance;
        this.paymentNums = paymentNums;
    }

   /* public Residents getResidents() {
        return residents;
    }

    public void setResidents(Residents residents) {
        this.residents = residents;
    }*/


    public int getStartDateInt() {
        return startDateInt;
    }

    public void setStartDateInt(int startDateInt) {
        this.startDateInt = startDateInt;
    }

    public int getEndDateInt() {
        return endDateInt;
    }

    public void setEndDateInt(int endDateInt) {
        this.endDateInt = endDateInt;
    }

    public int getRegDateInt() {
        return regDateInt;
    }

    public void setRegDateInt(int regDateInt) {
        this.regDateInt = regDateInt;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public int getPaymentNums() {
        return paymentNums;
    }

    public void setPaymentNums(int paymentNums) {
        this.paymentNums = paymentNums;
    }

    public List<Feesolution> getFeesolutionList() {
        return feesolutionList;
    }

    public void setFeesolutionList(List<Feesolution> feesolutionList) {
        this.feesolutionList = feesolutionList;
    }

    public List<CarType> getCarTypeList() {
        return carTypeList;
    }

    public void setCarTypeList(List<CarType> carTypeList) {
        this.carTypeList = carTypeList;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(BigDecimal lastBalance) {
        this.lastBalance = lastBalance;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getTyepName() {
        return tyepName;
    }

    public void setTyepName(String tyepName) {
        this.tyepName = tyepName;
    }

    public String getOwnerUuid() {
        return ownerUuid;
    }

    public void setOwnerUuid(String ownerUuid) {
        this.ownerUuid = ownerUuid;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getSpaceuuid() {
        return spaceuuid;
    }

    public void setSpaceuuid(String spaceuuid) {
        this.spaceuuid = spaceuuid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getWorkerUuid() {
        return workerUuid;
    }

    public void setWorkerUuid(String workerUuid) {
        this.workerUuid = workerUuid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getFeeSolutionUuid() {
        return feeSolutionUuid;
    }

    public void setFeeSolutionUuid(String feeSolutionUuid) {
        this.feeSolutionUuid = feeSolutionUuid;
    }

    public String getCarUuid() {
        return carUuid;
    }

    public void setCarUuid(String carUuid) {
        this.carUuid = carUuid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCarNums() {
        return carNums;
    }

    public void setCarNums(int carNums) {
        this.carNums = carNums;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getParkuuid() {
        return parkuuid;
    }

    public void setParkuuid(String parkuuid) {
        this.parkuuid = parkuuid;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
