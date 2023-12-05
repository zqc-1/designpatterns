package com.zqc.pattern.composite.demo.safe;

public class Test {
    public static void main(String[] args) {
        System.out.println("========安全模式的写法========");
        File qq = new File("qq.exe");
        File wx = new File("wx.exe");

        Folder office = new Folder("办公软件",2);
        File word = new File("Word.exe");
        File ppt = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");
        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder root = new Folder("D盘",1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        root.show();
        root.list();
    }
}
