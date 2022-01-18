package com.mycompany.api.mycompanyapi.api;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.api.mycompanyapi.uimodel.Customer;

public abstract class BaseController {

    //avoid this way to declaration
    public List<Customer> customers = new ArrayList<>();
    
    public List<Customer> getDummyCustomers() {
    
        customers.add(new Customer(1,"virtusa1","virt1@gmail.com"));
        customers.add(new Customer(2,"virtusa2","virt2@gmail.com"));
        customers.add(new Customer(3,"virtusa3","virt3@gmail.com"));
        customers.add(new Customer(4,"virtusa4","virt4@gmail.com"));
        customers.add(new Customer(5,"virtusa5","virt5@gmail.com"));
        
        return customers;
    }

    public void addCustomer(Customer cust) {
        customers.add(cust);
    }
}
