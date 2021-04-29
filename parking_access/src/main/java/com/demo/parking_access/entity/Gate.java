package com.demo.parking_access.entity;

import java.util.List;

public class Gate {

    private int id;
    private String uuid; //闸口uuid
    private String parkUuid; //所属上层uuid
    private String orgUuid; //最高单位uuid
    private int type; //闸口类型 1:入口 2:出口 3:出入口
    private String gateType; //描述
    private int level; //层级
    private String levelType; //描述
    private String name = ""; //闸口名称
    private int lastUpdateTime; //最后更新时间 时间戳
    private int enable;
    private String smallCarSolutionUuid;
    private int delete;
    private String middleCarSolutionUuid;
    private String largeCarSolutionUuid;
    private String benCarTypes;
    private int allow;
    private Company company; //单位
    private Feesolution feesolution;
    private List<Feesolution> smallList; //收费方案
    private List<Feesolution> middlleList; //收费方案
    private List<Feesolution> largeList; //收费方案
    private List<Gate> typeList; //typeList
    private List<Gate> levelList;


    private List<CarType> carTypeList; //闸口对应的禁止入内车辆类型
    private String nextName = ""; //出口闸道名称

    private int lastUpdateTimeInt;//增加闸口时生成当前时间戳



    public Gate() {
    }

    public Gate(String parkUuid) {
        this.parkUuid = parkUuid;
    }

    public Gate(String name, int type, String parkUuid) {
        this.name = name;
        this.type = type;
        this.parkUuid = parkUuid;
    }

    public Gate(String uuid, String name){
        this.uuid = uuid;
        this.name = name;
    }

    public Gate(int id, String name) {
        this.id = id;
        this.name= name;
    }

    public Gate(String levelType, int level) {
        this.levelType= levelType;
        this.level = level;
    }

    public Gate(int id, String uuid, String parkUuid, String orgUuid, int type, int level, String name, int lastUpdateTime, int enable, String smallCarSolutionUuid, int delete, String middleCarSolutionUuid, String largeCarSolutionUuid, String benCarTypes, int allow) {
        this.id = id;
        this.uuid = uuid;
        this.parkUuid = parkUuid;
        this.orgUuid = orgUuid;
        this.type = type;
        this.level = level;
        this.name = name;
        this.lastUpdateTime = lastUpdateTime;
        this.enable = enable;
        this.smallCarSolutionUuid = smallCarSolutionUuid;
        this.delete = delete;
        this.middleCarSolutionUuid = middleCarSolutionUuid;
        this.largeCarSolutionUuid = largeCarSolutionUuid;
        this.benCarTypes = benCarTypes;
        this.allow = allow;
    }


    public int getLastUpdateTimeInt() {
        return lastUpdateTimeInt;
    }

    public void setLastUpdateTimeInt(int lastUpdateTimeInt) {
        this.lastUpdateTimeInt = lastUpdateTimeInt;
    }

    public String getNextName() {
        return nextName;
    }

    public void setNextName(String nextName) {
        this.nextName = nextName;
    }

    public List<CarType> getCarTypeList() {
        return carTypeList;
    }

    public void setCarTypeList(List<CarType> carTypeList) {
        this.carTypeList = carTypeList;
    }

    public List<Gate> getLevelList() {
        return levelList;
    }

    public void setLevelList(List<Gate> levelList) {
        this.levelList = levelList;
    }

    public List<Gate> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<Gate> typeList) {
        this.typeList = typeList;
    }

    public Feesolution getFeesolution() {
        return feesolution;
    }

    public void setFeesolution(Feesolution feesolution) {
        this.feesolution = feesolution;
    }

    public List<Feesolution> getSmallList() {
        return smallList;
    }

    public void setSmallList(List<Feesolution> smallList) {
        this.smallList = smallList;
    }

    public List<Feesolution> getMiddlleList() {
        return middlleList;
    }

    public void setMiddlleList(List<Feesolution> middlleList) {
        this.middlleList = middlleList;
    }

    public List<Feesolution> getLargeList() {
        return largeList;
    }

    public void setLargeList(List<Feesolution> largeList) {
        this.largeList = largeList;
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

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(int lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getSmallCarSolutionUuid() {
        return smallCarSolutionUuid;
    }

    public void setSmallCarSolutionUuid(String smallCarSolutionUuid) {
        this.smallCarSolutionUuid = smallCarSolutionUuid;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public String getMiddleCarSolutionUuid() {
        return middleCarSolutionUuid;
    }

    public void setMiddleCarSolutionUuid(String middleCarSolutionUuid) {
        this.middleCarSolutionUuid = middleCarSolutionUuid;
    }

    public String getLargeCarSolutionUuid() {
        return largeCarSolutionUuid;
    }

    public void setLargeCarSolutionUuid(String largeCarSolutionUuid) {
        this.largeCarSolutionUuid = largeCarSolutionUuid;
    }

    public String getBenCarTypes() {
        return benCarTypes;
    }

    public void setBenCarTypes(String benCarTypes) {
        this.benCarTypes = benCarTypes;
    }

    public int getAllow() {
        return allow;
    }

    public void setAllow(int allow) {
        this.allow = allow;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
