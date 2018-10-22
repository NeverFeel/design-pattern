package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:恶汉式1：公有的静态域
 * （优点：简单明了；缺点：①浪费了空间，②通过反射依旧可以创建新对象）
 * @date 2018/10/22
 * @Modified by:
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){
    }
}
