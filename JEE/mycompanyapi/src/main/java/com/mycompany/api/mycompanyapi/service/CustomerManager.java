package com.mycompany.api.mycompanyapi.service;

import java.util.List;

import com.mycompany.api.mycompanyapi.uimodel.Customer;

public interface CustomerManager {
    public Customer addCustomer(Customer cust) throws IllegalAccessException;
    public List<Customer> getAllCustomers();
}
