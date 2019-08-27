package com.ilidan.strategy.strategyImpl;

import com.ilidan.strategy.Calculate;

/**
 * 减法
 */
public class Sub implements Calculate {
    @Override
    public double exec(int a, int b) {
        return a-b;
    }
}
