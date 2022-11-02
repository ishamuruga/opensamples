package com.company.payments.api.paymentsapi.service;

public interface PaymentManager {
    public String doPayment(Object payObj);
    public String fetchPaymentStatus(String txnRefNumber);
}
