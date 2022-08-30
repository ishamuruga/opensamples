package com.company.payment.api.mypaymentapi.runner;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.company.payment.api.mypaymentapi.entity.Account;
import com.company.payment.api.mypaymentapi.entity.AccountType;
import com.company.payment.api.mypaymentapi.entity.Address;
import com.company.payment.api.mypaymentapi.entity.Customer;
import com.company.payment.api.mypaymentapi.service.AddressManager;
import com.company.payment.api.mypaymentapi.service.CustomerManager;

@Component
public class MyCLIRunner implements CommandLineRunner {

    @Autowired
    private AddressManager addrManager;
    
    @Autowired
    private CustomerManager custManager;

    @Override
    public void run(String... args) throws Exception {

        Customer c1 = new Customer();
        c1.setDob(Calendar.getInstance());
        c1.setEmail("xyz@gmail.com" + Math.random());
        c1.setName("SuperStar");
        c1.setTs(Calendar.getInstance());


        AccountType actType1 = new AccountType();
        actType1.setDescription("Savings");

        AccountType actType2 = new AccountType();
        actType2.setDescription("Current");

        AccountType actType3 = new AccountType();
        actType3.setDescription("FD");



        Account a1 = new Account();
        a1.setBalance(1000);
        a1.setName("Company1");
        a1.setAType(actType1);

        Account a2 = new Account();
        a2.setBalance(2000);
        a2.setName("Company2");
        a2.setAType(actType2);

        Account a3 = new Account();
        a3.setBalance(3000);
        a3.setName("Company3");
        a3.setAType(actType3);

        Set<Account> accts = new HashSet<>();
        accts.add(a1);
        accts.add(a2);
        accts.add(a3);

        c1.setAccounts(accts);

        custManager.save(c1);

        //custManager.fullSave(c1);

        // Address addr = new Address();
        // addr.setAddCode("fa393d9b-4787-46d4-b226-81c6ddcf77e1");
        // //addr.setAddCode(UUID.randomUUID().toString());
        // addr.setAdddress1("123 Abcd street");
        // addr.setAdddress2("Super Duper Aveue");
        // addr.setAdddress3("Cross Street Nagar");
        // addr.setCity("Chennai");
        // addr.setCountry("India");
        // addr.setTs(Calendar.getInstance());
        // addr.setPcode("600092");

        //addrManager.save(addr);

        //custManager.fullSave(c1, addr);

        //System.out.println(custManager.getCustomerById(27));

        System.out.println("---------------Completed"); 
        
    }
    
}
