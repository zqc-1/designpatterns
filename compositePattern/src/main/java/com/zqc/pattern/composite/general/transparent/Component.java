package com.zqc.pattern.composite.general.transparent;

//抽象根节点
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not support!");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("removeChild not support!");
    }

    public boolean getChild(Component component) {
        throw new UnsupportedOperationException("getChild not support!");
    }
}
