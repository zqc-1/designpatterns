package com.zqc.pattern.singleton.lazy;

/**
 * 优点：性能高，线程安全
 * 缺点：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        //检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //检查是否要重新创建示例
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    //指令重排序的问题
                }
            }
        }
        return instance;
    }
}
