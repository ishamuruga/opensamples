package com.company.payments.api.paymentsapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.payments.api.paymentsapi.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    
}
