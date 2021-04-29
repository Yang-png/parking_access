package com.demo.parking_access.handEntity;

public class HandGate {

    private int id;
    private String uuid; //闸口uuid
    private String parkUuid; //所属上层uuid
    private String orgUuid; //最高单位uuid
    private int type; //闸口类型 1:入口 2:出口 3:出入口
    private String name;
    private int delete; //接收数据库信息
    private String deleted; //字符true false
    private String tempTollSolutionUuid; //方案uuid  默认小型车


    private String parkid;
    private int last_update_time;

    public HandGate() {
    }

    public HandGate(String uuid, String parkUuid, String orgUuid, int type, String name, String deleted, String tempTollSolutionUuid) {
        this.uuid = uuid;
        this.parkUuid = parkUuid;
        this.orgUuid = orgUuid;
        this.type = type;
        this.name = name;
        this.deleted = deleted;
        this.tempTollSolutionUuid = tempTollSolutionUuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getTempTollSolutionUuid() {
        return tempTollSolutionUuid;
    }

    public void setTempTollSolutionUuid(String tempTollSolutionUuid) {
        this.tempTollSolutionUuid = tempTollSolutionUuid;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public int getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(int last_update_time) {
        this.last_update_time = last_update_time;
    }
}
