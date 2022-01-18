package com.mycompany.api.mycompanyapi.api;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.api.mycompanyapi.uimodel.Customer;

public abstract class BaseController {

    //avoid this way to declaration
    public List<Customer> customers = new ArrayList<>();
    
    public List<Customer> getDummyCustomers() {
    
        customers.add(new Customer(1,"mycom1","t1@gmail.com"));
        customers.add(new Customer(2,"mycom2","rt2@gmail.com"));
        customers.add(new Customer(3,"mycom3","rt40@gmail.com"));
        customers.add(new Customer(4,"mycom4","rt4@gmail.com"));
        customers.add(new Customer(5,"mycom5","rt5@gmail.com"));
        
        return customers;
    }

    public void addCustomer(Customer cust) {
        customers.add(cust);
    }
}
