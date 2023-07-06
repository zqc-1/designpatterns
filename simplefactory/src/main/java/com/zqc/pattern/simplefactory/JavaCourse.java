package com.zqc.pattern.simplefactory;

public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("学习Java");
    }
}
