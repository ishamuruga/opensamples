package com.company.payments.api.paymentsapi.api;

import java.util.ArrayList;
import java.util.List;

import com.company.payments.api.paymentsapi.dto.CustomerResponse;

public abstract class BaseApiController {
    public List<CustomerResponse> getAllCustomerResponse() {
        List<CustomerResponse> res = new ArrayList<>();
        res.add(new CustomerResponse(1,"abcd"));
        res.add(new CustomerResponse(2,"uvw"));
        res.add(new CustomerResponse(3,"xyz"));
        
     
    
        return res;
    }
}
