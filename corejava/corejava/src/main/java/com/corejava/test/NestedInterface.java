package com.corejava.test;

public interface NestedInterface {
    void doSomething();
    interface Abcd {
        void doSomething2();
    }
}

class Client implements NestedInterface.Abcd{

    @Override
    public void doSomething2() {
        // TODO Auto-generated method stub
        
    }

}