package com.company.payments.api.paymentsapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.payments.api.paymentsapi.api.vhelper.CustomerApiViewHelper;
import com.company.payments.api.paymentsapi.dto.CreateCustomerRequest;
import com.company.payments.api.paymentsapi.dto.CreateCustomerResponse;
import com.company.payments.api.paymentsapi.entity.Customer;
import com.company.payments.api.paymentsapi.service.CustomerManager;

@RestController
@RequestMapping("/api/")
public class CustomerApi extends BaseApiController {
    
    @Autowired
    private CustomerManager custService;

    @Autowired
    private CustomerApiViewHelper customerApiViewHelper;

    @PostMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateCustomerResponse> save(@RequestBody CreateCustomerRequest cust){

        Customer custEnt = customerApiViewHelper.doConvertCreateCustomerRequestToCustomer(cust);
        
        Customer custRes = custService.save(custEnt);

        CreateCustomerResponse response = customerApiViewHelper.doConvertCustomerEntToCreateCustomerResponse(custRes);

        return new ResponseEntity<CreateCustomerResponse>(response, HttpStatus.OK);
    }
}
