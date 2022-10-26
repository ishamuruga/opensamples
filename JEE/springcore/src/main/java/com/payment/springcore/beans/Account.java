package com.payment.springcore.beans;

public class Account extends BaseBean{

    Account(){
        System.out.println("Account Bean is getting Created....");
    }

    private String accNbr;

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    @Override
    public String toString() {
        return "Account [accNbr=" + accNbr + "]";
    }

    
}
