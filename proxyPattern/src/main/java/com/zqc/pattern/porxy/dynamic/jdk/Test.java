package com.zqc.pattern.porxy.dynamic.jdk;

public class Test {
    public static void main(String[] args) {
        JDKMeiPo jdkMeiPo = new JDKMeiPo();
        IPerson zs = jdkMeiPo.getInstance(new PersonOne());
        zs.findLove();
        zs.buyInsure();

        IPerson zl = jdkMeiPo.getInstance(new PersonTwo());
        zl.findLove();
        zl.buyInsure();
    }
}
