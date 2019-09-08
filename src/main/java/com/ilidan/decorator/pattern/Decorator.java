package com.ilidan.decorator.pattern;

/**
 * 抽象的装饰类
 */
public abstract class Decorator implements Component{

    private Component component;
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
