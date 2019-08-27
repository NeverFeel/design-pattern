package com.ilidan.strategy;

import com.ilidan.strategy.enums.CalculateType;

import java.util.Optional;

/**
 * 计算上下文
 */
public class CalculateContext {
    private static final CalculateFactory CALCULATE_FACTORY = new CalculateFactory();

    public static CalculateFactory getCalculateFactory() {
        return CALCULATE_FACTORY;
    }

    public Optional<Calculate> getCalculateInstance(CalculateType type){
        return CALCULATE_FACTORY.createCalculate(type);
    }

}
