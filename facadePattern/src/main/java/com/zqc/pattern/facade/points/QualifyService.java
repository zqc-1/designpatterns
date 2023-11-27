package com.zqc.pattern.facade.points;

public class QualifyService {
    public boolean isAvailable(Info info) {
        System.out.println("校验" + info.getName() + "积分通过，库存通过！");
        return true;
    }
}
