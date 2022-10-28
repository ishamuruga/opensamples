package com.corejava.test;

import java.util.Scanner;

public class BinaryToDecimal {

    public static final String MESSAGE = "Enter Binary Value";
    public static final String REG_EX_ONLY_01="^[01]+$";

    public int convertBinaryToDecimal(String binary){
        char bits[] = binary.toCharArray();
        int res = 0;
        for(int i=0;i<bits.length;i++){
            int value = (int) Math.pow(2, (bits.length-i-1));
            res += value * Integer.parseInt(String.valueOf(bits[i]));
        }
        return res;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println(BinaryToDecimal.MESSAGE);

        String value = sc.nextLine();
        if (value.matches(BinaryToDecimal.REG_EX_ONLY_01)){
          
            System.out.println(Integer.parseInt(value,2));
            System.out.println(new BinaryToDecimal().convertBinaryToDecimal(value));
        } else {
            throw new IllegalAccessException("Illegal Input");
        }
        sc.close();
    }
}
