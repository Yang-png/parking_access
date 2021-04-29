package com.demo.parking_access.jjwApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  场内寻车
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeekCar {

    private String parkingId;
    private String businessId;
    private String plateId;
    private Number vehicleType;
    private String parkingStore;
    private Number parkingFloor;
    private String berthId;
    private String remark;
    private Number dataTime;

}
