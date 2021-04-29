package com.demo.parking_access.jjwApi;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 车辆减免
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reduces {

    private String parkingId; //场库 id
    private String plateId; //车牌号码
    private int vehicleType; //1-小型车 2-大型车
    private List<ReducesList> reducesLists;

}
