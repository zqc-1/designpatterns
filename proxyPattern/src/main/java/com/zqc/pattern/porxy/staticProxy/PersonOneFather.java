package com.zqc.pattern.porxy.staticProxy;

public class PersonOneFather implements IPerson {

    private PersonOne personOne;

    public PersonOneFather(PersonOne personOne) {
        this.personOne = personOne;
    }

    @Override
    public void findLove() {

        System.out.println("开始物色");
        personOne.findLove();
        System.out.println("开始交往");
    }
}
