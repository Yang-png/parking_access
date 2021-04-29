package com.demo.parking_access.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Worker {


    private int id;
    private String userName; //登录名
    private String passWord; //密码
    private String idEntity; //身份id orgUuid 代表所属最高组织编码
    private String imgPath; //头像路径
    private String name; //人员姓名
    private int male; //性别 1男 0女
    private String sex;
    private String parkUuid; //父节点对应上级组织编码 小区账号
    private String uuid; //账户生成uuid编码
    private String no; //账户工号
    private int role;  //1收银 3管理
    private String phone; //手机号
    private String email; //邮箱号
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regDate; //创建时间
    private int lastUpdateTime; //更新时间  时间戳int
    private int deleted; //未知  默认0
    private String funcRes; //暂时作废

    private int xu;
    private Company company;
    private Role rolee;

    //对接数据
    private String parkid;
    private String password;


    public Worker() {
    }

    public Worker(String userName) {
        this.userName = userName;
    }

    public Worker(int id, String userName, String passWord, String idEntity, String imgPath, String name, int male, String parkUuid, String uuid, String no, int role, String phone, String email, Date regDate, int lastUpdateTime, int deleted, String funcRes) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.idEntity = idEntity;
        this.imgPath = imgPath;
        this.name = name;
        this.male = male;
        this.parkUuid = parkUuid;
        this.uuid = uuid;
        this.no = no;
        this.role = role;
        this.phone = phone;
        this.email = email;
        this.regDate = regDate;
        this.lastUpdateTime = lastUpdateTime;
        this.deleted = deleted;
        this.funcRes = funcRes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXu() {
        return xu;
    }

    public void setXu(int xu) {
        this.xu = xu;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Role getRolee() {
        return rolee;
    }

    public void setRolee(Role rolee) {
        this.rolee = rolee;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public String getParkUuid() {
        return parkUuid;
    }

    public void setParkUuid(String parkUuid) {
        this.parkUuid = parkUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(int lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getFuncRes() {
        return funcRes;
    }

    public void setFuncRes(String funcRes) {
        this.funcRes = funcRes;
    }

}
