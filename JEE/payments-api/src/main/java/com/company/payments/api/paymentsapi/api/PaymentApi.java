package com.company.payments.api.paymentsapi.api;

import java.util.Calendar;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.payments.api.paymentsapi.dto.CustomerResponse;

@RestController
@RequestMapping("/api")
public class PaymentApi extends BaseApiController {

    @RequestMapping(method = RequestMethod.GET, value = "/init", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello() {
        return "Hi, i am from Spring Boot";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/fetch", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> fetchCustomerResponse() {
        CustomerResponse cres = new CustomerResponse(1, Math.random() + "");
        int a = 5/0;
        return new ResponseEntity<CustomerResponse>(cres, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerResponse>> fetchCustomerResponses() {
        return new ResponseEntity<List<CustomerResponse>>(this.getAllCustomerResponse(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> create(@Valid @RequestBody CustomerResponse res) {
        res.setName(res.getName().concat("..dell"));
        this.getAllCustomerResponse().add(res);
        
        return new ResponseEntity<CustomerResponse>(res, HttpStatus.OK); // 200

    }

}
