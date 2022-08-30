package com.company.payment.api.mypaymentapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.payment.api.mypaymentapi.entity.Address;
import com.company.payment.api.mypaymentapi.repo.AddressRepository;

@Service
@Transactional
public class AddressManagerImpl implements AddressManager {

    @Autowired
    private AddressRepository repo;

    @Override
    public Address save(Address addr) {
        // TODO Auto-generated method stub
       // return (Address)repo.save(addr);
       return null;
    }
    
}
