package com.zqc.pattern.abstractfactory;

public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("Java视频");
    }
}
