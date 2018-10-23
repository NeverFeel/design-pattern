package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式(双重检查锁定)
 * 优点：解决了Singleton5所产生的问题
 * 缺点：多线程的情况下存在线程使用了一个未被初始化的对象
 * @date 2018/10/23
 * @Modified by:
 */
public class Singleton6 {

    private static Singleton6 INSTANCE = null;
    private Singleton6 (){
    }

    public static Singleton6 getInstance() {
        if(INSTANCE == null){
            synchronized (Singleton6.class){
                if(INSTANCE == null){
                    //实例化一个对象：
                    // ①分配内存②初始化对象③设置INSTANCE指向分配的内存地址
                    //然而②和③可能会被重排序，导致其他线程使用了一个未被初始化的对象
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }
}
