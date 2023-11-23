package com.zqc.pattern.builder.general;

public class Director {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();

        System.out.println(builder.build());
    }
}
