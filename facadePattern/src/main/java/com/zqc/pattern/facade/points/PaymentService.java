package com.zqc.pattern.facade.points;

public class PaymentService {
    public boolean pay(Info info) {
        System.out.println("扣减" + info.getName() + "积分成功");
        return true;
    }
}
