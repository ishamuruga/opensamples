package com.company.payments.api.paymentsapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.payments.api.paymentsapi.entity.AccountStatement;

@Repository
public interface BankAccountStatementRepo extends JpaRepository<AccountStatement,Integer> {
    
}
