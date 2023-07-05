package com.zqc.pattern.simplefactory;

public class Test {
    public static void main(String[] args) {

        ICourse course = new CourseFactory().create(JavaCourse.class);
        course.record();

    }

}
