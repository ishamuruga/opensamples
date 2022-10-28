package com.corejava.Inheritance;

public abstract class PaymentManager {

    private int amount;

    protected String txnRefNumer;

    PaymentManager(int amount){
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public abstract void doPayment();
    
}
