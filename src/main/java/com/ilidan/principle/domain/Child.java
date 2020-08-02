package com.ilidan.principle.domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Child extends Parent {

    /**
     * 覆盖或实现父类的方法时输入的参数可以被放大
     */
    public void doSomething(Map map) {

        System.out.println("child doSomething invoked!");

    }

//    @Override
//    public Child doSomething(HashMap map) {
//        System.out.println("child doSomething invoked!");
//        return null;
//    }
}
