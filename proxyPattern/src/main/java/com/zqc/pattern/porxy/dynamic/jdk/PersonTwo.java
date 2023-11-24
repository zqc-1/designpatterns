package com.zqc.pattern.porxy.dynamic.jdk;


public class PersonTwo implements IPerson {

    @Override
    public void findLove() {
        System.out.println("赵六要求：有房有车");
    }

    @Override
    public void buyInsure() {
        System.out.println("100万");
    }
}
