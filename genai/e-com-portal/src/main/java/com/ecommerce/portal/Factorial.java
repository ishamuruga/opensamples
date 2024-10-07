package com.ecommerce.portal;

public class Factorial {
    

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }



    public static void main(String[] args) {
        System.out.println(fact(25));
    }

    // public class Factorial {
    //     public static long fact(int n) {
    //         if (n < 0) {
    //             throw new IllegalArgumentException("Factorial is not defined for negative numbers");
    //         }
            
    //         if (n > 20) {
    //             throw new ArithmeticException("Factorial calculation will overflow for n > 20");
    //         }
            
    //         long result = 1;
    //         for (int i = 2; i <= n; i++) {
    //             result *= i;
    //         }
    //         return result;
    //     }
    // }
    
}
