package com.company.payment.paymentapi.api;

import com.company.payment.paymentapi.service.PaymentServiceManager;
import com.company.payment.paymentapi.service.PaymentServiceManagerImpl;
import com.company.payment.paymentapi.uimodel.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PaymentApi extends BaseController {

    @Autowired
    private PaymentServiceManager service;
    
    @GetMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Customer> getDummyCustomer(){
        Customer cust = new Customer(1,"AlexPandiyan");
        return new ResponseEntity<Customer>(cust,HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{id}",produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Customer> getCustomer(@PathVariable int id){
        Customer cust = new Customer(id,"name"+id);
        return new ResponseEntity<Customer>(cust,HttpStatus.OK);
    }

    @PutMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> save(@RequestBody Customer cust) throws Exception {
       
        // if ((cust.getId() % 2) ==0) {
        //     return new ResponseEntity<Customer>(cust,HttpStatus.OK);
        // } else {
        //     return new ResponseEntity<Customer>(cust,HttpStatus.BAD_REQUEST);
        // }
        boolean res = service.validate(cust);

        return new ResponseEntity<Customer>(service.save(cust),HttpStatus.OK);
        
    }

}
