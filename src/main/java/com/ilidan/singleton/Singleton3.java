package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式(优点)
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
