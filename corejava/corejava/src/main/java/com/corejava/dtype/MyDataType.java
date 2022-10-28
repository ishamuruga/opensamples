package com.corejava.dtype;

public class MyDataType {
 
 //instance variable
 private short age;
 
 //static variable
 public static int counter = 0;
 
 public void run () {
	 //local variable
	 int a = 1000;
 }
 
 public static void main(String[] args) {
	 
    byte age =127;

    //-128 and +127
    //auto promotion
    byte age2 =  (byte)(age + age);

    System.out.println(age2);

 }   
}
