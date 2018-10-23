package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式最终版
 * 优点：解决了singleton7存在的问题
 * @date 2018/10/23
 * @Modified by:
 */
public class Singleton8 {

    private volatile static Singleton8 INSTANCE = null;
    private static boolean initialized = false;

    private Singleton8() {//当再次创造实例的时候抛出一个异常信息
        if (!initialized) {
            initialized = true;
        } else {
            throw new RuntimeException("instance initialized!");
        }
    }

    public static Singleton8 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton8.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton8();
                }
            }
        }
        return INSTANCE;
    }
}
