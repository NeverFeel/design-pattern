package com.ilidan.factory;

public class ComputerFactoryImpl implements ComputerFactory {
    @Override
    public <T extends Computer> T manufactureComputer(Class<T> clazz) {
        try{
            return (T) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            throw new RuntimeException("创建实例对象失败！");
        }
    }
}
