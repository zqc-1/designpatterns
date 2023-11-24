package com.zqc.pattern.porxy.dynamic.cglib;

public class Test {
    public static void main(String[] args) {
        PersonOne zs = (PersonOne) new CglibMeiPo().getInstance(PersonOne.class);
        zs.findLove();
    }
}
