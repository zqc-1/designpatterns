package com.zqc.pattern.factorymethod;

public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("学习Python");
    }
}
