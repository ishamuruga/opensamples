package com.company.payment.api.mypaymentapi.service;

import com.company.payment.api.mypaymentapi.entity.Address;
import com.company.payment.api.mypaymentapi.entity.Customer;

public interface CustomerManager {
    public Boolean fullSave(Customer cust,Address addr);
    
    public Customer save(Customer cust);

    public Customer getCustomerById(Integer id);
}
