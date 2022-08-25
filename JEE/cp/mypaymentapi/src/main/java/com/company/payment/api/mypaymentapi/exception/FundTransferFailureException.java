package com.company.payment.api.mypaymentapi.exception;

public class FundTransferFailureException extends Exception {

    private String errorCode;
    private String descriotion;
    
    public FundTransferFailureException(String message){
        super(message);
    }

    public FundTransferFailureException(String errorCode,String descriotion,String message){
        super(message);
        this.errorCode= errorCode;
        this.descriotion =descriotion;
    }


}
