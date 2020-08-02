package com.ilidan.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 多实例实现
 * @author yangy
 * @version 1.0
 * @date 2020/8/2 11:30 下午
 */
public class MultiSingleton {

    private String name;

    private static Map<Integer, MultiSingleton> multiSingletonMap;

    private static AtomicInteger count = new AtomicInteger(1);

    private static int maxInstanceSize = 2;
    static {
        multiSingletonMap = new ConcurrentHashMap<>(maxInstanceSize);
        for (int i=1; i<=2; i++) {
            multiSingletonMap.put(count.getAndIncrement(), new MultiSingleton(String.valueOf(i)));
        }
    }

    private MultiSingleton(){
        if (count.get() >= maxInstanceSize) {
            throw new RuntimeException("实例创建已达上限！");
        }
    }

    private MultiSingleton(String name){
        if (count.get() >= maxInstanceSize) {
            throw new RuntimeException("实例创建已达上限！");
        }
        this.name = name;
    }

    public MultiSingleton getMultiSingleton(Integer integer){
        return multiSingletonMap.get(integer);
    }

    public String getName() {
        return name;
    }
}
