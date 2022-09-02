package com.company.payment.api.mypaymentapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.payment.api.mypaymentapi.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    
}
