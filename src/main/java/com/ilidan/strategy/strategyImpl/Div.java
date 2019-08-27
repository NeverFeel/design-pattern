package com.ilidan.strategy.strategyImpl;

import com.ilidan.strategy.Calculate;

/**
 * 除法
 */
public class Div implements Calculate {
    @Override
    public double exec(int a, int b) {
        return a/b;
    }
}
