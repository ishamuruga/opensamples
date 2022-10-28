package com.corejava.test;

public  class  StaticClass {
    static int age = 10;

    static void run(){
        System.out.println("=============");
    }

    private int salary;

    static class ABCD {
        static void run2(){
            System.out.println("=============");
        }   
    }

    public static void main(String[] args) {
        //StaticClass.ABCD aa = new ABCD();
        //aa.run2();

        StaticClass.ABCD.run2();
    }
}
