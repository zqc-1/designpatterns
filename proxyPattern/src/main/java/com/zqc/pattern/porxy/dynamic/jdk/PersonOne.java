package com.zqc.pattern.porxy.dynamic.jdk;


public class PersonOne implements IPerson {

    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美");
    }

    @Override
    public void buyInsure() {
        System.out.println("30万");
    }
}
