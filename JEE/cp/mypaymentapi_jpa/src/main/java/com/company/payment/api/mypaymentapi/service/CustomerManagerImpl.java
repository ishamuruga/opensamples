package com.company.payment.api.mypaymentapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.company.payment.api.mypaymentapi.entity.Address;
import com.company.payment.api.mypaymentapi.entity.Customer;
import com.company.payment.api.mypaymentapi.repo.AddressRepository;
import com.company.payment.api.mypaymentapi.repo.CustomerRepository;

@Service
@Transactional
public class CustomerManagerImpl implements CustomerManager {

    @Autowired
    private CustomerRepository cDao;

    @Autowired
    private AddressRepository aDao;

    @Override
    public Customer save(Customer cust) {
        return (Customer)cDao.save(cust);
    }

    @Override
    public Boolean fullSave(Customer cust,Address addr) {
       
        cDao.save(cust);

        aDao.save(addr);

        return true;


    }

    public Customer getCustomerById(Integer id){
        // List<Customer> custs = cDao.getByid(id);
        
        // if (custs.size()==0 ||(custs==null)){
        //     //throw new IllegalAccessError("No Record Found");
        // } 

        // return custs.get(0);

        return null;
    }
    
}
