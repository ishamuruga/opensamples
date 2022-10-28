package com.corejava.test;

interface Car {
    void run(Engine engine);
    public class Engine {
        int capacity;
        String gearType;
    }
}

public class NestedInterfacewClass implements Car {

    @Override
    public void run(Engine e) {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        NestedInterfacewClass ncc = new NestedInterfacewClass();
        
    }
}