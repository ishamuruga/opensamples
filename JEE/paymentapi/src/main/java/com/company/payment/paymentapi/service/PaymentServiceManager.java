package com.company.payment.paymentapi.service;

import com.company.payment.paymentapi.exception.CustomerInvalidException;
import com.company.payment.paymentapi.uimodel.Customer;

public interface PaymentServiceManager {
    public Customer save(Customer cust);

    public boolean validate(Customer cust) throws CustomerInvalidException ;
}
