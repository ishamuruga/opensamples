package com.company.payment.api.mypaymentapi.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
