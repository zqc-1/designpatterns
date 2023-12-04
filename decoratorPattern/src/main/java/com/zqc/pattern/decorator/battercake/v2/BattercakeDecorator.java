package com.zqc.pattern.decorator.battercake.v2;

public class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return battercake.getMsg();
    }

    @Override
    public int getPrice() {
        return battercake.getPrice();
    }
}
