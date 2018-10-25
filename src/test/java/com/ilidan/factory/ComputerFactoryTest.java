package com.ilidan.factory;

public class ComputerFactoryTest {

    public static void main(String[] args) {
//        ComputerFactory factory = new ComputerFactoryImpl();
//        System.out.println("制造MacBook...");
//        MacBook macBook = factory.manufactureComputer(MacBook.class);
//        macBook.computerDesc();
//        System.out.println("制造HaseeBook...");
//        HaseeBook haseeBook = factory.manufactureComputer(HaseeBook.class);
//        haseeBook.computerDesc();
//        System.out.println("制造AsusBook...");
//        AsusBook asusBook = factory.manufactureComputer(AsusBook.class);
//        asusBook.computerDesc();

        MacBook macBook = ComputerFactoryLazyInitailizer.manufactureComputer(MacBook.class);
        MacBook macBook2 = ComputerFactoryLazyInitailizer.manufactureComputer(MacBook.class);
        System.out.println(macBook == macBook2);

    }


}
