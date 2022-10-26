package com.payment.springcore;

import org.springframework.aop.interceptor.ConcurrencyThrottleInterceptor;

public class MyClass {
    MyClass(){
        System.out.println("======Init");
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
        System.out.println("....Clean Up");
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc = null;
    }
}
