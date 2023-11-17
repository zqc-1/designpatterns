package com.zqc.pattern.singleton.test;

import com.zqc.pattern.singleton.threadLocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("END");
    }
}
