package com.company.payment.api.mypaymentapi.api;

import java.util.Calendar;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.payment.api.mypaymentapi.entity.Address;
import com.company.payment.api.mypaymentapi.entity.Customer;
import com.company.payment.api.mypaymentapi.service.CustomerManager;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    
    @Autowired
    private CustomerManager service;
    
    //private CustomerManager service;

    // CustomerController(CustomerManager _service) {
    //     this.service = _service;
    // }

    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> saveCustomer(@Valid @RequestBody Customer cust) {
        Customer res = service.save(cust);

        return new ResponseEntity<Customer>(res, HttpStatus.OK);
    }

    @GetMapping(value="/fsave",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> fSave() {
        Customer c1 = new Customer();
        c1.setDob(Calendar.getInstance());
        c1.setEmail("abcd@gmail.com" + Math.random());
        c1.setName("Abcd123");
        c1.setTs(Calendar.getInstance());

        //custManager.fullSave(c1);

        Address addr = new Address();
        addr.setAddCode("fa393d9b-4787-46d4-b226-81c6ddcf77e1");
        //addr.setAddCode(UUID.randomUUID().toString());
        addr.setAdddress1("123 Abcd street");
        addr.setAdddress2("Super Duper Aveue");
        addr.setAdddress3("Cross Street Nagar");
        addr.setCity("Chennai");
        addr.setCountry("India");
        addr.setTs(Calendar.getInstance());
        addr.setPcode("600092");

        //addrManager.save(addr);

        service.fullSave(c1, addr);

        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }
}
