package com.ilidan.strategy;

import com.ilidan.strategy.enums.CalculateEnum;
import com.ilidan.strategy.enums.CalculateType;

import java.util.Optional;

/**
 * 策略模式测试
 */
public class CalculateTest {

    public static void main(String[] args) {

//        CalculateContext calculateContext = new CalculateContext();
//        Optional<Calculate> addOptional = calculateContext.getCalculateInstance(CalculateType.ADD);
//        Optional<Calculate> subOptional = calculateContext.getCalculateInstance(CalculateType.SUB);
//        addOptional.ifPresent(item -> System.out.println(item.exec(1, 2)));
//        subOptional.ifPresent(item -> System.out.println(item.exec(1, 2)));


        System.out.println(CalculateEnum.ADD.exec(3, 5));;

    }

}
