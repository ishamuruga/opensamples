package com.supers.sb.hw.springboothw.service;

import java.util.Optional;

import com.supers.sb.hw.springboothw.entity.Customer;
import com.supers.sb.hw.springboothw.exception.NotAMajorAgeCustomerException;

public interface CustomerManager {
	public String getCustomers();
	public boolean verifyAge(int age) throws NotAMajorAgeCustomerException;
	
	public void save(Customer cust);
	public Optional<Customer> fetchCustomerById(int id);
}
