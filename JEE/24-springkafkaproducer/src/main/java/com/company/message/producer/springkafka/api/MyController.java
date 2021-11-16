package com.company.message.producer.springkafka.api;

import com.company.message.producer.springkafka.payload.Customer;
import com.company.message.producer.springkafka.payload.CustomerRequest;
import com.company.message.producer.springkafka.producer.MessageProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController extends BaseController {

    @Autowired
    private MessageProducer producer;
    
    @GetMapping(value = "/init/{id}")
    public ResponseEntity<CustomerRequest> sendCustomerReq(@PathVariable int id){
        Customer cust = new Customer();
        cust.setId(id);
        cust.setName("company-" + id);
        cust.setEmail("company" + id + "@company.com");


        CustomerRequest custReq = new CustomerRequest();
        custReq.setCust(cust);
        
        if ((id % 2)==0){
            custReq.setState("Insert");
        } else {
            custReq.setState("Update");
        }

        producer.sendCustomerReqMessage(custReq);
        
        return new ResponseEntity<CustomerRequest>(custReq,HttpStatus.OK);

    }

}
