package com.company.payments.api.paymentsapi.cli_runner;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.company.payments.api.paymentsapi.entity.AccountType;
import com.company.payments.api.paymentsapi.entity.BankAccount;
import com.company.payments.api.paymentsapi.entity.Customer;
import com.company.payments.api.paymentsapi.repo.CustomerRepo;
import com.company.payments.api.paymentsapi.service.AccountTypeManager;
import com.company.payments.api.paymentsapi.service.CustomerManager;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CustomerManager custService;

    @Autowired
    private AccountTypeManager accTypeService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("############################################");
        System.out.println("My Command Line Started");
        System.out.println("############################################");
        
        // AccountType aType1 = new AccountType();
        // aType1.setType("SAVINGS");

    
        // AccountType aType2 = new AccountType();
        // aType2.setType("CURRENT");

        AccountType aType1 = accTypeService.fetchById(1);
        AccountType aType2 = accTypeService.fetchById(2);

        BankAccount ba1 = new BankAccount();
        ba1.setAType(aType2);
        ba1.setAccNbr("098843343"+Math.random());
        ba1.setBalance(1000);
        ba1.setBankCode("BNK001");
        

        BankAccount ba2 = new BankAccount();
        ba2.setAType(aType1);
        ba2.setAccNbr("09884343434" + Math.random());
        ba2.setBalance(1001);
        ba2.setBankCode("BNK002");

        Set<BankAccount> baAccts= new HashSet<>();
        baAccts.add(ba2);
        baAccts.add(ba1);

        Customer cust = new Customer();
        cust.setDob(Calendar.getInstance());
        cust.setEmail("us@gmail.com" + Math.random());
        cust.setName("Mr JamesBond");
        cust.setBankAccounts(baAccts);


        custService.save(cust);
    }
    
}
