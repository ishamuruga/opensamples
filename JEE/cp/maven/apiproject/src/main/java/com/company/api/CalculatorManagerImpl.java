package com.company.api;

public class CalculatorManagerImpl implements CalculatorManager {

    @Override
    public Integer add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiple(int a, int b) {
        return a*b;
    }
     
}
