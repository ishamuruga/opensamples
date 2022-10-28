package com.corejava.nested;

public class StaticNestedClass {
    
    static int age = 45;
    
    int salary = 1000;
    
    private String ABCD = "Super";
    
    private static String message = "HI";
    
    
    static class MyStaticClass {
        static void run() {
            System.out.println(age);
            //System.out.println(salary);
            System.out.println(message);
        }
    }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StaticNestedClass.MyStaticClass mc = new StaticNestedClass.MyStaticClass();
        mc.run();
    }

}
