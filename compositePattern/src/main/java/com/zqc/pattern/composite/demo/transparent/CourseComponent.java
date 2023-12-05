package com.zqc.pattern.composite.demo.transparent;

public abstract class CourseComponent {

    public void addChild(CourseComponent component) {
        throw new UnsupportedOperationException("不支持添加");
    }

    public void removeChild(CourseComponent component) {
        throw new UnsupportedOperationException("不支持删除");
    }

    public String getName(CourseComponent component) {
        throw new UnsupportedOperationException("不支持获取名称");
    }

    public double getPrice(CourseComponent component) {
        throw new UnsupportedOperationException("不支持获取价格");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印");
    }
}
