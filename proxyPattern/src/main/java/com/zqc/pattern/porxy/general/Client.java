package com.zqc.pattern.porxy.general;

public class Client {
    public static void main(String[] args) {
        ReadSubject readSubject = new ReadSubject();
        Proxy proxy = new Proxy(readSubject);
        proxy.request();
    }
}
