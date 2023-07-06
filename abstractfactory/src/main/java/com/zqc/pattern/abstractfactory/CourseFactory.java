package com.zqc.pattern.abstractfactory;

public abstract class CourseFactory {

    public void init(){
        System.out.println("初始化基础数据的方法");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();


}
