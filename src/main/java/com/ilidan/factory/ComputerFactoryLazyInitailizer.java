package com.ilidan.factory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author ilidan_Y
 * @Package com.ilidan.factory
 * @Description:具有延迟初始化特性的工厂
 * @date 2018/10/25
 * @Modified by:
 */
public class ComputerFactoryLazyInitailizer {

    private static ConcurrentMap<String, Computer> computerMap = new ConcurrentHashMap<>();

    public static synchronized <T extends Computer>T manufactureComputer(Class<T> clazz) {
        String className = clazz.getName();
        Computer computer = null;
        if (computerMap.containsKey(className)) {
            computer = computerMap.get(className);
        } else {
            try {
                computer = (Computer) clazz.forName(className).newInstance();
                computerMap.put(className, computer);
            } catch (Exception e) {
                throw new RuntimeException("创建实例对象失败!");
            }
        }
        return (T) computer;
    }


}
