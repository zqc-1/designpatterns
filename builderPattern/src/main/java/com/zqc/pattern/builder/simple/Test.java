package com.zqc.pattern.builder.simple;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder();

        courseBuilder.addName("设计模式");
        courseBuilder.addPpt("【设计模式PPT】");
        courseBuilder.addVideo("【设计模式录播视频】");

        System.out.println(courseBuilder.build());
    }
}
