package com.mycompany.mybankapi.service;

import java.util.List;

import com.mycompany.mybankapi.model.College;
import com.mycompany.mybankapi.repo.CollegeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeManagerImpl implements CollegeManager {

    @Autowired
    private CollegeRepo repo;

    @Override
    public College save(College college) {
        return repo.save(college);
    }

    @Override
    public List<College> fetchAll() {
        return repo.fetchAll();
    }
    
}
