package com.ilidan.factory;

public class MacBook implements  Computer{
    @Override
    public void computerDesc() {
        System.out.println("制造了一台MacBook pro!");
    }
}
