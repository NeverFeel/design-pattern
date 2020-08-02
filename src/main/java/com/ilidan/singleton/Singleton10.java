package com.ilidan.singleton;

import java.io.Serializable;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:恶汉式（可被序列化的单例）
 * @date 2018/10/24
 * @Modified by:
 */
public class Singleton10 implements Serializable {

    private static final long serialVersionUID = 5185146094229978960L;
    private volatile static boolean initialized = false;

    private Singleton10() {
        if (!initialized) {
            initialized = true;
        } else {
            throw new RuntimeException("instance initialized!");
        }
    }

    public static Singleton10 getInstance() {
        return Singleton10.Singleton10Holder.INSTANCE;
    }

    /**
     * @Description:避免反序列化产生新的对象:
     * 通过反射初始化一个实例对象，初始化成功后，
     * 会再次判断实例化的对象中是否存在readResolve()
     * 方法，如果存在，则通过反射调用对象的readResolve()
     * 方法返回对象的实例。
     */
    private Object readResolve() {
        return getInstance();
    }

    static class Singleton10Holder {
        private static final Singleton10 INSTANCE = new Singleton10();
    }

}
