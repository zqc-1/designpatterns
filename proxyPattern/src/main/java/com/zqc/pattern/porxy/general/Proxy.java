package com.zqc.pattern.porxy.general;

public class Proxy implements ISubject{
    private ISubject subject;

    public Proxy(ISubject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("called befor request().");
    }

    private void after() {
        System.out.println("called after request().");
    }

}
