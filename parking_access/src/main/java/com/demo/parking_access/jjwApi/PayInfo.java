package com.demo.parking_access.jjwApi;

import lombok.*;

//支付查询
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PayInfo {

    private String parkingId;
    private String businessId;
    private String orderId;
    private String plateId;
    private Number vehicleType;
    private long arrivedTime;
    private Number totalMoney;
    private Number reduceMoney;
    private Number reduceTime;
    private String reduceCode;
    private Number dueMoney;
    private long validityQuoteTime;
    private String remark;
    private Number dataTime;



    public PayInfo(String parkingId, String plateId, Number vehicleType, Number dataTime) {
        this.parkingId = parkingId;
        this.plateId = plateId;
        this.vehicleType = vehicleType;
        this.dataTime = dataTime;
    }

}
