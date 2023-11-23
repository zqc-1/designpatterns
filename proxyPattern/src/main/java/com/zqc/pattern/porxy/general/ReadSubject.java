package com.zqc.pattern.porxy.general;

public class ReadSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
