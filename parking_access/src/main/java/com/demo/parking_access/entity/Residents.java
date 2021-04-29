package com.demo.parking_access.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.util.List;

/*@HeadRowHeight(10) //表头行高*/
public class Residents {

    @ExcelIgnore
    private int id; //id

    @ExcelProperty(value ={"人事信息表","人事姓名"})
    @ColumnWidth(20)
    private String name; //居民名称

    @ExcelProperty(value ={"人事信息表","身份证号码"})
    @ColumnWidth(20)
    private String idNumber; //身份证编码

    @ExcelProperty(value ={"人事信息表","手机号码"})
    @ColumnWidth(20)
    private String phone; //手机

    @ExcelProperty(value ={"人事信息表","居住地址"})
    @ColumnWidth(20)
    private String location; //地址

    @ExcelProperty(value ={"人事信息表","所属上级单位"})
    @ColumnWidth(20)
    private String companyName; //存储上级单位名称


    @ExcelProperty(value ={"人事信息表","所属公司"})
    @ColumnWidth(20)
    private String companyNameAll;

    @ExcelIgnore
    private String idEntity; //所属最高组织

    @ExcelIgnore
    private String state; //状态

    @ExcelIgnore
    private String uuid;

    @ExcelIgnore
    private String houseName;//用于接收前端变量

    @ExcelIgnore
    private String companyCid; //所属上级组织


    @ExcelIgnore
    private String imgPath; //图片路径

    @ExcelIgnore
    private int xu; //序号

    @ExcelIgnore
    private Company company;

    @ExcelIgnore
    private List<Company> companyList;

 /*   @ExcelIgnore
    private ImpowerProject project;//居民对应角色*/



    public Residents() {
    }


    public Residents(String companyCid) {
        this.companyCid = companyCid;
    }

    public Residents(String companyCid, String name, String phone) {
        this.companyCid = companyCid;
        this.name = name;
        this.phone = phone;
    }


    public Residents(int id, String name, String idNumber, String phone, String location, String companyName, String companyNameAll, String idEntity, String state, String uuid, String houseName, String companyCid, String imgPath, int xu, Company company, List<Company> companyList) {
        this.id = id;
        this.name = name;
        this.idNumber = idNumber;
        this.phone = phone;
        this.location = location;
        this.companyName = companyName;
        this.companyNameAll = companyNameAll;
        this.idEntity = idEntity;
        this.state = state;
        this.uuid = uuid;
        this.houseName = houseName;
        this.companyCid = companyCid;
        this.imgPath = imgPath;
        this.xu = xu;
        this.company = company;
        this.companyList = companyList;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCompanyNameAll() {
        return companyNameAll;
    }

    public void setCompanyNameAll(String companyNameAll) {
        this.companyNameAll = companyNameAll;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIdEntity() {
        return idEntity;
    }

    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

  /*  public ImpowerProject getProject() {
        return project;
    }

    public void setProject(ImpowerProject project) {
        this.project = project;
    }*/

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyCid() {
        return companyCid;
    }

    public void setCompanyCid(String companyCid) {
        this.companyCid = companyCid;
    }

    public int getXu() {
        return xu;
    }

    public void setXu(int xu) {
        this.xu = xu;
    }
}
