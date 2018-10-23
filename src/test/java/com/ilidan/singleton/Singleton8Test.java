package com.ilidan.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:
 * @date 2018/10/23
 * @Modified by:
 */
public class Singleton8Test {

    @Test
    public void testReflection() throws Exception {
        Singleton8 instance = Singleton8.getInstance();
        Class<Singleton8> clazz = Singleton8.class;
        Constructor<Singleton8> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton8 instance2 = constructor.newInstance();//反射破坏了单例
        System.out.println("instance:" + instance);
        System.out.println("instance2:" + instance2);
    }

}
