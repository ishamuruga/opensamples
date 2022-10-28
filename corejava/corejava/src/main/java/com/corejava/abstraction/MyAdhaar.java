package com.corejava.abstraction;

public class MyAdhaar {

    private String aNum;

    MyAdhaar(String adhaarNumber){
        this.aNum= adhaarNumber;
    }

    private boolean validateAdhaar(){
        // validate aNum

        return true;
    }

    public void doValidate(){
        validateAdhaar();
    }

    public static void main(String[] args) {
        MyAdhaar madh = new MyAdhaar("3434343434231");
        madh.doValidate();
    }
}

