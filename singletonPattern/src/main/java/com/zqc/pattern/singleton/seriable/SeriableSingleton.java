package com.zqc.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * 反序列化破坏单例,及解决方法
 */
public class SeriableSingleton implements Serializable {

    //序列化
    //把内存中对象的状态装换成字节码的形式
    //把字节码通过IO输出流，写到磁盘上
    //永久保存下来，持久化

    //反序列化
    //将持久化的字节码内容，通过IO输入流，读到内存中来
    //转成一个Java对象

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    //解决反序列化破坏
    private Object readResolve() {
        return INSTANCE;
    }
}
