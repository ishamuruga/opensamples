package com.company.payment.paymentapi.uimodel;

import java.util.Calendar;

public class ErrorDetails extends BaseModel {

    private String errorMessage;

    private Calendar ts;

    private String errCode;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Calendar getTs() {
        return ts;
    }

    public void setTs(Calendar ts) {
        this.ts = ts;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    
}
