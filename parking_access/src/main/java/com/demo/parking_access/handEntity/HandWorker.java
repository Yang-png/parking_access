package com.demo.parking_access.handEntity;

/**
 * 同步工作人员信息
 */
public class HandWorker {

    private int id;
    private String no; //账户工号
    private int role;
    private int regDate;
    private String uuid;
    private String orgUuid;
    private String parkUuid;
    private String password;
    private int delete; //数据库deleted
    private Boolean deleted;
    private Boolean male;
    private int mal; //数据库性别
    private String email;
    private int lastUpdateTime;
    private String phone;
    private String name;  //数据库userName

    private String parkid;
    private Long last_update_time;

    public HandWorker() {
    }

    public HandWorker(int id, String no, int role, int regDate, String uuid, String orgUuid, String parkUuid, String password, int delete, Boolean deleted, Boolean male, String email, int lastUpdateTime, String phone, String name) {
        this.id = id;
        this.no = no;
        this.role = role;
        this.regDate = regDate;
        this.uuid = uuid;
        this.orgUuid = orgUuid;
        this.parkUuid = parkUuid;
        this.password = password;
        this.delete = delete;
        this.deleted = deleted;
        this.male = male;
        this.email = email;
        this.lastUpdateTime = lastUpdateTime;
        this.phone = phone;
        this.name = name;
    }

    public int getMal() {
        return mal;
    }

    public void setMal(int mal) {
        this.mal = mal;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public Long getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(Long last_update_time) {
        this.last_update_time = last_update_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getRegDate() {
        return regDate;
    }

    public void setRegDate(int regDate) {
        this.regDate = regDate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrgUuid() {
        return orgUuid;
    }

    public void setOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
    }

    public String getParkUuid() {
        return parkUuid;
    }

    public void setParkUuid(String parkUuid) {
        this.parkUuid = parkUuid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(int lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
