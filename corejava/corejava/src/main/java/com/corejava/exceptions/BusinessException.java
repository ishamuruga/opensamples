package com.corejava.exceptions;

public class BusinessException extends Exception {
    public BusinessException(String message, Exception e){
        super(message, e);
    }
}
