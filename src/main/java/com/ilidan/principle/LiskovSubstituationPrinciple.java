package com.ilidan.principle;

import com.ilidan.principle.domain.Child;
import com.ilidan.principle.domain.Parent;

import java.util.HashMap;
import java.util.Map;

/**
 * 里式替换原则
 */ 
public class LiskovSubstituationPrinciple {

    public static void main(String[] args) {
        Parent parent = new Child();
        Map map = new HashMap();
//        parent.doSomething(map);

    }
}
