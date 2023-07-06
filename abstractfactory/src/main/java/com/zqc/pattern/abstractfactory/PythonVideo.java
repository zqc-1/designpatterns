package com.zqc.pattern.abstractfactory;

public class PythonVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("Python视频");
    }
}
