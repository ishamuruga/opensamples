package com.company.payment.api.mypaymentapi.exception;

public class InSufficientBalanceException extends Exception {
    
    public InSufficientBalanceException(String message){
        super(message);
    }
}
