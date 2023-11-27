package com.zqc.pattern.facade.points;

public class Test {
    public static void main(String[] args) {

        FacadeService facadeService = new FacadeService();
        Info info = new Info("《Spring》");
        facadeService.exchange(info);

    }
}
