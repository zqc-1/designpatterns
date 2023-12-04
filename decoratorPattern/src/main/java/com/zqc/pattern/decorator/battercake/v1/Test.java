package com.zqc.pattern.decorator.battercake.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "，总价：" + battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + "，总价：" + battercakeWithEgg.getPrice());

        BattercakeWithEggAndSausages eggAndSausages = new BattercakeWithEggAndSausages();
        System.out.println(eggAndSausages.getMsg() + "，总价：" + eggAndSausages.getPrice());
    }
}
