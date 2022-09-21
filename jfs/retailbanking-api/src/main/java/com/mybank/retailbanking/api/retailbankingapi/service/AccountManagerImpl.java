package com.mybank.retailbanking.api.retailbankingapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.retailbanking.api.retailbankingapi.entity.Account;
import com.mybank.retailbanking.api.retailbankingapi.repo.AccountRepository;

@Service
public class AccountManagerImpl implements AccountManager {

    @Autowired
    private AccountRepository repo;

    @Override
    public void save(Account act) {
        repo.save(act);
    }

    @Override
    public List<Account> fetchAll() {
        
        return repo.findAll();
    }
    
}
