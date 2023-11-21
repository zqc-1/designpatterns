package com.zqc.pattern.prototype.singleton;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * 原型模式破坏单例及解决
 * 方法一： 不实现 Cloneable
 * 方法二：clone 方法 return  instance;
 */

@Data
public class ConcretePrototype implements Cloneable {
    private int age;
    private String name;
    private List<String> hobbies;

    private static ConcretePrototype instance = new ConcretePrototype();

    private ConcretePrototype() {}

    public static ConcretePrototype getInstance(){
        return instance;
    }

    @Override
    protected ConcretePrototype clone() {
//        try {
//            return (ConcretePrototype) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//            return null;
//        }
        //方法二：
        return instance;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
