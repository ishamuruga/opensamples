package com.mycompany.api.mycompanyapi.api;

import java.util.List;

import com.mycompany.api.mycompanyapi.service.CustomerManager;
import com.mycompany.api.mycompanyapi.service.CustomerManagerImpl;
import com.mycompany.api.mycompanyapi.uimodel.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CustomerController extends BaseController{

    //private CustomerManager service = new CustomerManagerImpl();

    @Autowired
    private CustomerManager service;
        
    @RequestMapping(value = "/init",method=RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> getCustomers() {
        return new ResponseEntity<List<Customer>>(service.getAllCustomers(),HttpStatus.OK);    
    }
   
    @RequestMapping(value = "/init/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getCustomer(@PathVariable int id) {
        Customer customer = service.getAllCustomers().get(id);
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);    
    }

    @RequestMapping(value="/save",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer saveCustomer(@RequestBody Customer cust) throws IllegalAccessException{
        service.addCustomer(cust);

        Customer cust1 = null;
        //service.addCustomer(cust1);

        return cust;
    }
    
}
