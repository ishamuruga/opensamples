package com.company.payments.api.paymentsapi.service;

import java.util.List;

import com.company.payments.api.paymentsapi.entity.inh.Employee;

public interface EmployeeManager {
    public void save(Employee emp);
    public List<Employee> fetchAll();
    public List<Employee> findByName(String name);    
}
