package com.company.payments.api.paymentsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.payments.api.paymentsapi.entity.inh.Employee;
import com.company.payments.api.paymentsapi.repo.EmployeeRepo;

@Service
public class EmployeeManagerImpl  implements EmployeeManager {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public void save(Employee emp) {
        repo.save(emp);
    }

    @Override
    public List<Employee> fetchAll() {
        // TODO Auto-generated method stub
        return repo.findMyAll();
    }

    @Override
    public List<Employee> findByName(String name) {
        // TODO Auto-generated method stub
        return repo.findByName(name);
    }
    
}
