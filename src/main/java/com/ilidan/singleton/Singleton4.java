package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式
 * 优点：通过方法加锁，解决了多线程下的并发产生多个对象问题
 * 缺点：方法锁比较笨重，每次方法调用都要获取锁和释放锁，性能低下
 * @date 2018/10/23
 * @Modified by:
 */
public class Singleton4 {

    private static Singleton4 INSTANCE = null;
    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }
}
