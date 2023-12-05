package com.zqc.pattern.composite.demo.safe;

public class File extends Direcotry{
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
