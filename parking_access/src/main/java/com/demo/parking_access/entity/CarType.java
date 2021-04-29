package com.demo.parking_access.entity;

/**
 * 车辆类型
 */
public class CarType {

    private int id;
    private int intUuid;
    private String name;

    public CarType() {
    }

    public CarType(int id, int intUuid, String name) {
        this.id = id;
        this.intUuid = intUuid;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntUuid() {
        return intUuid;
    }

    public void setIntUuid(int intUuid) {
        this.intUuid = intUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
