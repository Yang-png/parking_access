package com.demo.parking_access.jjwApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 错峰签约
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stagger {

    private String signId; //签约编号
    private int signStatus; //1-有效 2-取消
    private String staggerCode; //策略id
    private String productId; //产品id
    private String parkingId; //场库id
    private String plateId; //车牌号码
    private String vehicleType; //1-小型车 2-大型车
    private String staggerDayFrom; //签约错峰开始日期
    private String staggerDayTo; //签约错峰结束日期

}
