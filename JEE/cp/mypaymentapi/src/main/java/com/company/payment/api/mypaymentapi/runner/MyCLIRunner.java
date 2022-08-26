package com.company.payment.api.mypaymentapi.runner;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.company.payment.api.mypaymentapi.dao.AddressRepository;
import com.company.payment.api.mypaymentapi.entity.Address;

@Component
public class MyCLIRunner implements CommandLineRunner {

    @Autowired
    private AddressRepository addrRepo;

    @Override
    public void run(String... args) throws Exception {
        Address addr = new Address();
        addr.setAddCode(UUID.randomUUID().toString());
        addr.setAdddress1("123 Abcd street");
        addr.setAdddress2("Super Duper Aveue");
        addr.setAdddress3("Cross Street Nagar");
        addr.setCity("Chennai");
        addr.setCountry("India");
        addr.setPcode("600092");

        addrRepo.save(addr);

        System.out.println("---------------Completed");
        
    }
    
}
