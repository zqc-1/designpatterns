package com.zqc.pattern.decorator.battercake.v2;

public class SuasagesDecorator extends BattercakeDecorator{

    public SuasagesDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 3;
    }
}
