package com.company.payments.api.paymentsapi.api.vhelper;

import org.springframework.stereotype.Component;

import com.company.payments.api.paymentsapi.dto.CreateCustomerRequest;
import com.company.payments.api.paymentsapi.dto.CreateCustomerResponse;
import com.company.payments.api.paymentsapi.entity.Customer;

//@Component
public class CustomerApiViewHelper extends BaseViewHelper {

    public Customer doConvertCreateCustomerRequestToCustomer(CreateCustomerRequest req) {
        Customer custEnt = new Customer();
        custEnt.setDob(req.getDob());
        custEnt.setEmail(req.getEmail());
        custEnt.setName(req.getName());
        custEnt.setBankAccounts(req.getBankAccounts());
        return custEnt;
    }

    public CreateCustomerResponse doConvertCustomerEntToCreateCustomerResponse(Customer custEnt) {
        CreateCustomerResponse res = new CreateCustomerResponse();
        res.setDob(custEnt.getDob());
        res.setEmail(custEnt.getEmail());
        res.setName(custEnt.getName());
        res.setId(custEnt.getId());
        res.setStatus("Sucess");
        res.setAccounts(custEnt.getBankAccounts());

        return res;
    }

}
