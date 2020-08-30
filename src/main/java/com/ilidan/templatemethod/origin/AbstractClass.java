package com.ilidan.templatemethod.origin;

/** 
 * 抽象的模板方法类
 */
public abstract class AbstractClass {

    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    public void templateMethod(){
        /**
         * 调用基本方法，完成相应的逻辑
         */
        doSomething();
        doAnything();
    }

}
