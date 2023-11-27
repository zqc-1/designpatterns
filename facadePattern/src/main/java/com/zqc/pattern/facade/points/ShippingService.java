package com.zqc.pattern.facade.points;

public class ShippingService {
    public String delivery(Info info) {
        System.out.println(info.getName() + "进入物流系统");
        String shippingNo = "666";
        return shippingNo;
    }
}
