package com.zqc.pattern.builder.chain;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder()
                .addName("设计模式")
                .addPpt("【设计模式PPT】")
                .addVideo("【设计模式录播视频】");

        System.out.println(courseBuilder.build());
    }
}
