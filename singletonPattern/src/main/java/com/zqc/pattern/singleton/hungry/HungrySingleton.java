package com.zqc.pattern.singleton.hungry;

/**
 * 优点：执行效率高，性能高，没有任何锁
 * 缺点：在某些情况下，可能造成内存浪费
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
