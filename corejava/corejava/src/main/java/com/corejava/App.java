package com.corejava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 99;
        //0101 --> 1 + 4
        //1010 --> 0 + 2+ 8
        System.out.println(Integer.toBinaryString(a));
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(~a));
        
    }
}
