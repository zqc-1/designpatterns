package com.zqc.pattern.porxy.staticProxy;

public class Test {
    public static void main(String[] args) {
        PersonOneFather personOneFather = new PersonOneFather(new PersonOne());
        personOneFather.findLove();
    }
}
