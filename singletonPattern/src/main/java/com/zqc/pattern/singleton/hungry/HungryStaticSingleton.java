package com.zqc.pattern.singleton.hungry;

public class HungryStaticSingleton {
    //先静态后动态
    //先上，后下
    //先属性后方法
    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
