package com.ilidan.decorator.pattern;

/**
 * 具体的装饰类A
 */
public class ConcreteDecoratorA extends  Decorator{

    public ConcreteDecoratorA(Component component){
        super(component);
    }

    @Override
    public void operate() {
        this.method();
        super.operate();
    }

    private void method(){
        System.out.println("ConcreteDecoratorA operate invoked!");
    }
}
