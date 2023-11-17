package com.zqc.pattern.singleton.threadLocal;

/**
 * ThreadLocal 单例
 * 保证线程内部的全局唯一，且天生线程安全
 */
public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
