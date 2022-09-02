package com.company.payment.api.mypaymentapi.exception;

public class FDCreationException extends Exception {

    private String errorCode;
    private String descriotion;
    
    public FDCreationException(String message){
        super(message);
    }

    public FDCreationException(String errorCode,String descriotion,String message){
        super(message);
        this.errorCode= errorCode;
        this.descriotion =descriotion;
    }


}
