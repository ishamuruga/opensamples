package com.company.payment.api.mypaymentapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.payment.api.mypaymentapi.dao.CustomerRepository;
import com.company.payment.api.mypaymentapi.entity.Customer;

@Service
@Transactional
public class CustomerManagerImpl implements CustomerManager {

    @Autowired
    private CustomerRepository dao;

    @Override
    public Customer save(Customer cust) {
        return dao.save(cust);
    }
    
}
