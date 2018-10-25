package com.ilidan.factory;

public interface ComputerFactory {

     <T extends Computer> T manufactureComputer(Class<T> clazz);

}
