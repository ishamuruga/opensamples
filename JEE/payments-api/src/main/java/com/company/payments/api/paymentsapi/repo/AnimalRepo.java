package com.company.payments.api.paymentsapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.payments.api.paymentsapi.entity.inh.Animal;

@Repository
public interface AnimalRepo extends JpaRepository<Animal,Integer> {
    
}
