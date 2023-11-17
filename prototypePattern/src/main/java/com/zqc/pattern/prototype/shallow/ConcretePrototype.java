package com.zqc.pattern.prototype.shallow;

import lombok.Data;

import java.util.List;

@Data
public class ConcretePrototype implements Cloneable {
    private int age;
    private String name;
    private List<String> hobbies;


    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
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
