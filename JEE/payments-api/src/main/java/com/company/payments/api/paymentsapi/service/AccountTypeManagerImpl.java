package com.company.payments.api.paymentsapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.payments.api.paymentsapi.entity.AccountType;
import com.company.payments.api.paymentsapi.repo.BankAccountTypeRepo;

@Service
public class AccountTypeManagerImpl implements AccountTypeManager {

    @Autowired
    private BankAccountTypeRepo repo;

    @Override
    public Optional<AccountType> fetchById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void save(AccountType actType) {
        repo.save(actType);
    }
    
}
