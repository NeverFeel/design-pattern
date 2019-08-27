package com.ilidan.strategy;

import com.ilidan.strategy.enums.CalculateType;
import com.ilidan.strategy.strategyImpl.Add;
import com.ilidan.strategy.strategyImpl.Div;
import com.ilidan.strategy.strategyImpl.Mul;
import com.ilidan.strategy.strategyImpl.Sub;

import java.util.Optional;

/**
 * 计算工厂方法
 */
public class CalculateFactory {

    /**
     * 这里可以通过单例模式缓存每个计算实例
     * @param calculateType 计算类型
     * @return Optional<Calculate>
     */
    public Optional<Calculate> createCalculate(CalculateType calculateType) {
        Optional<Calculate> optional;
        switch (calculateType) {
            case ADD:
                optional = Optional.of(new Add());
                break;
            case SUB:
                optional = Optional.of(new Sub());
                break;
            case DIV:
                optional = Optional.of(new Div());
                break;
            case MUL:
                optional = Optional.of(new Mul());
                break;
            default:
                optional = Optional.empty();
        }
        return optional;
    }

}
