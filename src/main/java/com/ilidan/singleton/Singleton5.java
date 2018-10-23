package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式
 * 优点:解决了Singleton4所带来性能问题
 * 缺点：引入了新的问题，多线程的情况下产生多个实例（比如
 * A，B线程同时到达①，此时INSTANCE未被实例化，假设A先
 * 获得锁，之后实例化对象，结束之后释放锁，此时B线程的INSTANCE
 * 仍处于未被实例化状态，再次获取锁并实例化INSTANCE，结
 * 果就生成了两个对象）
 *
 * @date 2018/10/23
 * @Modified by:
 */
public class Singleton5 {

    private static Singleton5 INSTANCE = null;
    private Singleton5(){
    }

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {//①
            synchronized (Singleton5.class) {
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }
}
