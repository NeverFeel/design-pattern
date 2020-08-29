package com.ilidan.abstractfactory;

/** 
 *
 */ 
public class Product1Creator extends AbstractProductCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
