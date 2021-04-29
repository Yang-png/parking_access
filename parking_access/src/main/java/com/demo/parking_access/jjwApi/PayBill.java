package com.demo.parking_access.jjwApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 场库主动向市平台下载缴费账单，当日账单无法下载。场库获取对账信息 后进行对账核查
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayBill {

    public String parkingId; //场库 id
    public String businessId; //停车业务编号
    public String orderId; //支付订单号
    public int payMoney; //支付金额
    public int payType; //1- 支付宝 2- 微信
    public long payTime; //支付时间
    public String remark; //备注信息
    public long dataTime; //请求时间
    public long payDate; //下载订单时间


}
