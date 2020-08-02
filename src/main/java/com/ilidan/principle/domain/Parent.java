package com.ilidan.principle.domain;

import java.util.HashMap;

/**
 *
 */ 
public class Parent {

    /**
     * 覆盖或实现父类的方法时输入的参数可以被放大
     */
    public Parent doSomething(HashMap map){
        System.out.println("Parent doSomething invoked");
        return null;
    }

}
