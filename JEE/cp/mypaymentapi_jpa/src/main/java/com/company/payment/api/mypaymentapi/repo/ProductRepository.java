package com.company.payment.api.mypaymentapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.payment.api.mypaymentapi.entity.inheritance.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}
