package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式（静态内部类的形式）
 * 推荐使用的版本，原因：
 * ①在内部类加载的时候加载，节省空间。
 * ②只加载一次，一次是线程安全的
 * ③没有synchronized，不会造成多余的性能损耗
 * @date 2018/10/24
 * @Modified by:
 */
public class Singleton9 {

    private volatile static boolean initialized = false;

    private Singleton9() {
        if (!initialized) {
            initialized = true;
        } else {
            throw new RuntimeException("instance initialized!");
        }
    }

    public static Singleton9 getInstance() {
        return Singleton9Holder.INSTANCE;
    }

    static class Singleton9Holder {
        private static final Singleton9 INSTANCE = new Singleton9();
    }
}
