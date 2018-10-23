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
public class Singleton7Test {

    @Test
    public void testReflection() throws Exception {
        Singleton7 instance = Singleton7.getInstance();
        Class<Singleton7> clazz = Singleton7.class;
        Constructor<Singleton7> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton7 instance2 = constructor.newInstance();//反射破坏了单例
        System.out.println("instance:" + instance);
        System.out.println("instance2:" + instance2);
    }

}
