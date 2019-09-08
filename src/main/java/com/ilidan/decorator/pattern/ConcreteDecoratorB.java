package com.ilidan.decorator.pattern;

/**
 *  具体的装饰类B
 */
public class ConcreteDecoratorB extends  Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.method();
        super.operate();
    }

    private void method(){
        System.out.println("ConcreteDecoratorB operate invoked!");
    }

}
