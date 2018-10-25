package com.ilidan.factory;

public class ComputerFactoryImpl implements ComputerFactory {
    public <T extends Computer> T manufactureComputer(Class<T> clazz) {
        try{
            return (T) clazz.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            throw new RuntimeException("创建实例对象失败！");
        }
    }
}
