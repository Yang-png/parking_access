package com.demo.parking_access.jjwApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 车辆减免
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReducesList {

    private String reduceTypeId; //减免类型编码
    private String orderId; //支付订单号
    private String reduceCode; //减免代码编号
    private int reduceMoney; //减免金额
    private int reduceTime; //减免金额
    private int reduceFrom; //减免起始时间
    private int reduceTo; //减免截至时间
    private String remark; //备注信息
    private int dataTime; //请求时间

}
