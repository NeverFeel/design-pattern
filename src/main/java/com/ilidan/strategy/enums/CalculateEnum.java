package com.ilidan.strategy.enums;

/**
 * 策略枚举
 */
public enum CalculateEnum {

    ADD(CalculateType.ADD) {
        @Override
        public double exec(int a, int b) {
            return a + b;
        }
    },

    SUB(CalculateType.SUB) {
        @Override
        public double exec(int a, int b) {
            return a - b;
        }
    },

    MUL(CalculateType.MUL) {
        @Override
        public double exec(int a, int b) {
            return a * b;
        }
    },

    DIV(CalculateType.DIV) {
        @Override
        public double exec(int a, int b) {
            return a / b;
        }
    };

    private CalculateType calculateType;

    CalculateEnum(CalculateType calculateType) {
        this.calculateType = calculateType;
    }

    public abstract double exec(int a, int b);

    public CalculateType getCalculateType() {
        return calculateType;
    }

}
