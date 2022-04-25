package com.company.aop.impl;

public class MyAdhaarValidatorImpl implements MyAdhaarValidatorManager {

    @Override
    public void addAdhaar() {
        System.out.println(" ## Add Adhaar Method ##");
        
    }

    @Override
    public String getAdhaar() {
        System.out.println(" ## Get Adhaar Method ##");
        return "1234 5345 2342 23";
    }

    @Override
    public void getAdhaarThrowsException() throws Exception {
        System.out.println(" ## Get Adhaar Method w Exception ##");
        throw new Exception("Errors Errors, I dont like Errors....");
    }

    @Override
    public String getAdhaarAround(String value) {
        System.out.println(" ## Get Adhaar Around Method ##");
        return value.concat("...Company...");
    }
    
}
