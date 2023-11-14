package com.zqc.pattern.singleton.test;

import com.zqc.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.zqc.pattern.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
