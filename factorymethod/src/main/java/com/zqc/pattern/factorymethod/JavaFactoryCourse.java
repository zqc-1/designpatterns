package com.zqc.pattern.factorymethod;

public class JavaFactoryCourse implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
