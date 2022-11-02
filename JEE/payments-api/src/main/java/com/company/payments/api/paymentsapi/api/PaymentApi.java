package com.company.payments.api.paymentsapi.api;

import java.util.Calendar;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.payments.api.paymentsapi.config.MyDbConfig;
import com.company.payments.api.paymentsapi.config.MyDefaultConfig;
import com.company.payments.api.paymentsapi.dto.CustomerResponse;
import com.company.payments.api.paymentsapi.service.CreditCardPaymentManagerImpl;
import com.company.payments.api.paymentsapi.service.CustomerManager;
import com.company.payments.api.paymentsapi.service.PaymentManager;

@RestController
@RequestMapping("/api")
public class PaymentApi extends BaseApiController {

    @Autowired
    private MyDefaultConfig config;
    
    @Autowired
    private MyDbConfig dbConfig;


    @RequestMapping(method = RequestMethod.GET, value = "/init", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello() {
        return "Hi, i am from Spring Boot";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/fetch", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> fetchCustomerResponse() {
        CustomerResponse cres = new CustomerResponse(1, Math.random() + "");
        System.out.println(config.getAwsPassword());
        System.out.println(config.getAwsUrl());
        System.out.println(config.getAwsUserId());
        return new ResponseEntity<CustomerResponse>(cres, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerResponse>> fetchCustomerResponses() {
        return new ResponseEntity<List<CustomerResponse>>(this.getAllCustomerResponse(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customerold", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> create(@Valid @RequestBody CustomerResponse res) {
        res.setName(res.getName().concat("..dell"));
        this.getAllCustomerResponse().add(res);
        
        return new ResponseEntity<CustomerResponse>(res, HttpStatus.OK); // 200

    }

}
