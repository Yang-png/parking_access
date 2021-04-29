package com.demo.parking_access.jjwApi;

import lombok.*;

//支付返回
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaySuccess {

    private String parkingId;
    private String bussinessId;
    private String orderId;
    private String plateId;
    private Number vehicleType;
    private Number payMoney;
    private Number payStatus;
    private Number payType;
    private Number payTime;
    private Number dataTime;
    private String logUuid;
    private String parkUuid;

    public PaySuccess(String parkingId, String bussinessId, String orderId, String plateId, Number vehicleType, Number payMoney, Number payStatus, Number payType, Number payTime, Number dataTime) {
        this.parkingId = parkingId;
        this.bussinessId = bussinessId;
        this.orderId = orderId;
        this.plateId = plateId;
        this.vehicleType = vehicleType;
        this.payMoney = payMoney;
        this.payStatus = payStatus;
        this.payType = payType;
        this.payTime = payTime;
        this.dataTime = dataTime;
    }
}
