package com.corejava.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileRead {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        File file = new File(
            "C:\\Users\\rsubramanian\\temp-del\\retraining\\corejava\\src\\main\\java\\com\\corejava\\test\\test.txt");

            
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
    }
}
