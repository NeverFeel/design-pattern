package com.ilidan.strategy.strategyImpl;

import com.ilidan.strategy.Calculate;

/**
 * 乘法
 */
public class Mul implements Calculate {
    @Override
    public double exec(int a, int b) {
        return a * b;
    }
}
