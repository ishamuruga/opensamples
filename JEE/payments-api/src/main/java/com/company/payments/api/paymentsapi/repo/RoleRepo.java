package com.company.payments.api.paymentsapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.payments.api.paymentsapi.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer>{
    
}
