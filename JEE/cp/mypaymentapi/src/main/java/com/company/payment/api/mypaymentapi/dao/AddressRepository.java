package com.company.payment.api.mypaymentapi.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.payment.api.mypaymentapi.entity.Address;

@Repository
@Transactional
public class AddressRepository extends BaseRepository{
        
    @Autowired
    private SessionFactory factory;

    public Address save(Address addr){
        Session session = factory.getCurrentSession();
        session.save(addr);
        return addr;
    }
}
