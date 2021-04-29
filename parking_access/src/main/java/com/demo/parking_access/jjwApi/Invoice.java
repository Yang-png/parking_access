package com.demo.parking_access.jjwApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  发票开具
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

    private String parkingId; //场库ID
    private String plateId; //车牌
    private int vehicleType; //1-小型车 2-大型车
    private Number dataTime; //请求时间
    private String businessId; //业务订单号
    private String orderId; //支付订单号
    private int payMoney; //付款金额
    private int payType; //1-停车APP 2-微信 3-支付宝
    private long payTime; //支付时间

    public Invoice(String parkingId, String plateId) {
        this.parkingId = parkingId;
        this.plateId = plateId;
    }
}
