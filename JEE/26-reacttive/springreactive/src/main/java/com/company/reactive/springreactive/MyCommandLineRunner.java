package com.company.reactive.springreactive;

import java.util.Date;

import com.company.reactive.springreactive.entity.SuperCar;
import com.company.reactive.springreactive.service.SuperCarManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private SuperCarManager service;

    @Override
    public void run(String... args) throws Exception {
        SuperCar sc = new SuperCar();
        sc.setEngineCapacity((int) (Math.random()*1000));
        sc.setFuel(3);
        sc.setManfDate(new Date());
        sc.setSellingDate(new Date());
        sc.setType("Covertible");
        sc.setVin("vin676732322");
        
        service.save(sc);
        System.out.println("=====================================================inserted.." + sc.getId());
    }
    
}