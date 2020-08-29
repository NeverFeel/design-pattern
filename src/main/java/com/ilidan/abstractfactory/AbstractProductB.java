package com.ilidan.abstractfactory;

/** 
 * 
 * @author yangy
 * @date 2020/8/29 3:37 下午
 * @version 1.0 
 */ 
public abstract class AbstractProductB implements Product{

    @Override
    public void desc() {
        System.out.println("ProductB");
    }

}
