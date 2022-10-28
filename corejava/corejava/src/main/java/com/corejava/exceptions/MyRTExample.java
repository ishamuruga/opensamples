package com.corejava.exceptions;

public class MyRTExample {
    
    public void doSomething() {
        
        int ans = 5/0;
        
        int ages[] = {10,23,45};
        System.out.println(ages[6]);
    }

    public static void main(String[] args) {
        try {
            new MyRTExample().doSomething();
        }   catch(Exception ex) {
            System.out.println("Error Occure..." + ex.getMessage());
            //ex.printStackTrace();
        }
    }

}
