package com.corejava.test;

final class Bike {
    void run() {
        System.out.println("running");
    }
}

public class FInalClass extends Bike {
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}