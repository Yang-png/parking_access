package com.demo.parking_access.jjwApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 在线停车预约查询
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserves {

    private String reserveId; //预约 id
    private int reserveStatus; //1- 预约有效 2- 预约取消
    private String parkingId; //场库 id
    private String plateId; //车牌号码
    private int reserveFrom; //预约入场起始时间
    private int reserveTo; //预约入场截至时间
    private int vehicleType; //1-小型车 2-大型车
    private String remark; //备注信息
    private int  dataTime; //请求时间


}
