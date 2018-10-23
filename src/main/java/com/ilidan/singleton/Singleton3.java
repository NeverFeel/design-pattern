package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式
 * 优点：在需要时才会创建对象，节省了空间。
 * 缺点：多线程下存在并发产生多个对象问题
 * @date 2018/10/22
 * @Modified by:
 */
public class Singleton3 {

    private static Singleton3 INSTANCE = null;
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }

}
