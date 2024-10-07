package com.ecommerce.portal;

public class FactorialwDefects {
    public static void main(String[] args) {
        int number = -5; // Example of a negative input
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

  public static int factorial(int n) {
      if (n < 0) {
          throw new IllegalArgumentException("Factorial is not defined for negative numbers");
      }
      if (n == 0 || n == 1) {
          return 1;
      }
      return n * factorial(n - 1);
  }
    // public static int factorial(int n) {
    //     // Infinite loop if n is negative because it will never reach the base case
    //     if (n == 0) {
    //         return 1;
    //     } else {
    //         return n * factorial(n - 1);
    //     }
    // }
}
