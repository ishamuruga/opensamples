package com.company.aop.impl;

public interface MyAdhaarValidatorManager {
    
    public void addAdhaar();

    public String getAdhaar();

    public void getAdhaarThrowsException()  throws Exception;

    public String getAdhaarAround(String value);

}
