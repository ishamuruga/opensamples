package com.mycompany.api.mycompanyapi.service;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.api.mycompanyapi.config.MyAppConfig;
import com.mycompany.api.mycompanyapi.uimodel.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerManagerImpl implements CustomerManager {

    public List<Customer> customers = new ArrayList<>();
  
    @Autowired
    private MyAppConfig config;

    @Override
    public Customer addCustomer(Customer cust) throws IllegalAccessException {
         
        if (cust==null) {
            throw new IllegalAccessException("Empty Customer are not allowed");
        }
        int a = 8/0;
         customers.add(cust);
         System.out.println("==============================");
         System.out.println(config.getAppname());
         System.out.println(config.getServername());
         return cust;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }
    
    
}
