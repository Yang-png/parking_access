package com.demo.parking_access.jjwApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 场库向市平台查询支付信息
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payresult {

    private String parkingId; //场库 id
    private String businessId; //停车业务编号
    private String orderId; //支付订单号
    private String plateId; //车牌号码
    private Number vehicleType; //1-小型车 2-大型车
    private Number payMoney; //付款金额（单位：分）
    private Number payStatus; //1- 支付成功 2- 支付失败
    private Number payType; //1- 上海停车APP 2- 上海停车微信端 3- 上海停车支付宝端
    private Number payTime; //支付时间
    private Number dataTime; //请求时间

}
