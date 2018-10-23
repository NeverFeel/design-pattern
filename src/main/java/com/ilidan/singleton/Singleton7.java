package com.ilidan.singleton;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:懒汉式
 * 优点：解决了Singleton6的问题
 * 缺点：仍然存在问题
 * 通过反射破坏单例查看测试用例Singleton7Test#testReflection()
 * @date 2018/10/23
 * @Modified by:
 */
public class Singleton7 {

    private volatile static  Singleton7 INSTANCE = null;
    private Singleton7(){
    }

    public static Singleton7 getInstance() {
        if(INSTANCE == null){
            synchronized (Singleton7.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton7();
                }
            }
        }
        return INSTANCE;
    }
}
