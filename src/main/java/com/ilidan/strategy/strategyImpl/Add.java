package com.ilidan.strategy.strategyImpl;

import com.ilidan.strategy.Calculate;

/**
 * 加法
 */
public class Add implements Calculate {
    @Override
    public double exec(int a, int b) {
        return a+b;
    }
}
