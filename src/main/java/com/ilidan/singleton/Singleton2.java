package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:恶汉式：静态工厂方法
 * 优点：简单明了；
 * 缺点：①浪费了空间，②通过反射依旧可以创建新对象
 * @date 2018/10/22
 * @Modified by:
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE = new Singleton2();
    private Singleton2(){
    }

    public static Singleton2 getInstance(){
        return INSTANCE;
    }

}
