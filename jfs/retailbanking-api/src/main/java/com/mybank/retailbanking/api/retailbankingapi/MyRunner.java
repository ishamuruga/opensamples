package com.mybank.retailbanking.api.retailbankingapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mybank.retailbanking.api.retailbankingapi.entity.Account;
import com.mybank.retailbanking.api.retailbankingapi.service.AccountManager;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private AccountManager service;

    @Override
    public void run(String... args) throws Exception {
       
        Account act1 = new Account();
        act1.setName("Savings");

        Account act2 = new Account();
        act2.setName("Current");

        Account act3 = new Account();
        act3.setName("RD");

        Account act4 = new Account();
        act4.setName("FD");

        service.save(act1);
        service.save(act2);
        service.save(act3);
        service.save(act4);

    }
    
}
