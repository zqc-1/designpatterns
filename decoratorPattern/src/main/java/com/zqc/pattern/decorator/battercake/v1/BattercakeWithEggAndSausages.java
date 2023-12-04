package com.zqc.pattern.decorator.battercake.v1;

public class BattercakeWithEggAndSausages extends BattercakeWithEgg{

    protected String getMsg(){ return super.getMsg() + "+1个香肠";}

    public int getPrice(){return super.getPrice() + 3;}
}
