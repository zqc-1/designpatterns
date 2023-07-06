package com.zqc.pattern.factorymethod;

public class PythonFactoryCourse implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
