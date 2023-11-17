package com.zqc.pattern.prototype.general;

public class Client {
    public static void main(String[] args) {
        //创建原对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("lisi");
        System.out.println(prototype);

        //拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        System.out.println(cloneType);
    }
}
