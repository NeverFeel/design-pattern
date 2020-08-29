package com.ilidan.abstractfactory;

/** 
 *
 */ 
public class Test {

    public static void main(String[] args) {

        AbstractProductCreator c1 = new Product1Creator();
        AbstractProductCreator c2 = new Product2Creator();

        AbstractProductA productA1 = c1.createProductA();
        productA1.desc();
        productA1.doSomething();

        AbstractProductB productB1 = c1.createProductB();
        productB1.desc();
        productB1.doSomething();

        AbstractProductA productA2 = c2.createProductA();
        productA2.desc();
        productA2.doSomething();

        AbstractProductB productB2 = c2.createProductB();
        productB2.desc();
        productB2.doSomething();
    }

}
