package com.zqc.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例：将每一个示例都缓存到统一的容器中，使用唯一标识获取实例
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        Object instance = null;
        if (!ioc.containsKey(className)) {
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className, instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        } else {
            return ioc.get(className);
        }
    }
}
