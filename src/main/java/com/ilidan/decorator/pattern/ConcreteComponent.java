package com.ilidan.decorator.pattern;

/**
 * 具体的被装饰类
 */
public class ConcreteComponent implements Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate invoked！");
    }
}
