package com.mycompany.mybankapi.service;

import java.util.List;

import com.mycompany.mybankapi.model.College;

public interface CollegeManager {

    public College save(College college);

    public List<College> fetchAll();
    
}
