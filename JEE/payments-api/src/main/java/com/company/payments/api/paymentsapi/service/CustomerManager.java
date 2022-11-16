package com.company.payments.api.paymentsapi.service;

import java.util.List;
import java.util.Optional;

import com.company.payments.api.paymentsapi.dto.CreateCustomerRequest;
import com.company.payments.api.paymentsapi.dto.CreateCustomerResponse;
import com.company.payments.api.paymentsapi.entity.Customer;
import com.company.payments.api.paymentsapi.entity.CustomerJoin;

public interface CustomerManager {
    public Customer save(Customer cust);
    public List<Customer> fetchAll();
    public Optional<Customer> fetchById(Integer id);
    public List<CustomerJoin> fetchJoinData();
    public void modifyCust(String v, Integer id);
}
