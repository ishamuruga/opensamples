package com.company.payment.api.mypaymentapi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.payment.api.mypaymentapi.entity.Customer;

@Repository
public class CustomerRepository extends BaseRepository {
    
    @Autowired
    private SessionFactory factory;

    public Customer save(Customer cust){
        Session session = factory.getCurrentSession();
        session.save(cust);
        return cust;
    }

}
