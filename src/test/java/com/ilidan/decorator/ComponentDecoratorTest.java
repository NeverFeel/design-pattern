package com.ilidan.decorator;

import com.ilidan.decorator.pattern.Component;
import com.ilidan.decorator.pattern.ConcreteComponent;
import com.ilidan.decorator.pattern.ConcreteDecoratorA;
import com.ilidan.decorator.pattern.ConcreteDecoratorB;

/**
 * 组件装饰类测试
 */
public class ComponentDecoratorTest {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component);
        component = new ConcreteDecoratorB(component);
        component.operate();

    }

}
