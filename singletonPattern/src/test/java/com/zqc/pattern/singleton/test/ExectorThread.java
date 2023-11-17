package com.zqc.pattern.singleton.test;

import com.zqc.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.zqc.pattern.singleton.lazy.LazySimpleSingleton;
import com.zqc.pattern.singleton.threadLocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
