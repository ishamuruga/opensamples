package com.company.payment.api.mypaymentapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.payment.api.mypaymentapi.entity.User;

public interface UserRepo extends JpaRepository<User,Integer> {
    
}
