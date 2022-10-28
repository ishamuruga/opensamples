package com.corejava.Inheritance;

public class UPIPaymentManager extends PaymentManager {
    private String upiId;

    UPIPaymentManager(String upiId,int amount){
        super(amount);
        this.upiId = upiId;
    }

    public void doPayment() {
        // TODO Auto-generated method stub
        //advance way paument
    }
}
