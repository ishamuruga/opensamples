package com.company.payments.api.paymentsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.payments.api.paymentsapi.dto.CreateCustomerRequest;
import com.company.payments.api.paymentsapi.dto.CreateCustomerResponse;
import com.company.payments.api.paymentsapi.entity.Customer;
import com.company.payments.api.paymentsapi.repo.CustomerRepo;

@Service
public class CustomerManagerImpl implements CustomerManager {
    
    @Autowired
    private CustomerRepo repo;


    @Override
    public List<Customer> fetchAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Customer> fetchById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Customer save(Customer cust) {
        return repo.save(cust);
    }
}
