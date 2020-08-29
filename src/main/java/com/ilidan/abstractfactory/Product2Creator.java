package com.ilidan.abstractfactory;

/** 
 *
 */ 
public class Product2Creator extends AbstractProductCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
