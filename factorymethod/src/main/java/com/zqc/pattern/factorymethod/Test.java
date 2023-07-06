package com.zqc.pattern.factorymethod;

import org.slf4j.ILoggerFactory;

public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaFactoryCourse();
        ICourse course = factory.create();
        course.record();
    }
}
