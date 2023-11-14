package com.zqc.pattern.singleton.lazy;

/**
 * 优点：节省内存，线程安全
 * 缺点：性能低，
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {}

    public synchronized static LazySimpleSingleton getInstance(){
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
