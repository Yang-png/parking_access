package com.demo.parking_access.jjwApi;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  停车缴费信息提交
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private String businessId; //停车业务编号
    private String orderId; //支付订单号
    private String plateId; //车牌号码
    private int vehicleType; //1-小型车 2-大型车
    private int arrivedTime; //入场时间
    private int totalMoney; //总金额
    private int reduceMoney; //减免减免金额
    private int reduceTime; //减免时间
    private String reduceCode; //减免减免代码编号
    private int dueMoney; //应付金额
    private long validityQuoteTime; //保价有效时间是指应付金额的最迟支付时间
    private long dataTime; //请求时间

}
