package com.mycompany.mybankapi.service;

import java.util.Optional;

import com.mycompany.mybankapi.config.MyAConfig;
import com.mycompany.mybankapi.config.MyAppConfig;
import com.mycompany.mybankapi.exceptions.UnderAgeStudentException;
import com.mycompany.mybankapi.model.Student;
import com.mycompany.mybankapi.repo.StudentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsManagerImpl implements StudentsManager {

    @Autowired
    private MyAppConfig cfg;

    @Autowired
    private MyAConfig aCFG;

    @Autowired
    private StudentsRepository sRepo;

    @Override
    public Student add(Student stu) throws IllegalAccessException, UnderAgeStudentException {

        // if (stu.getId() < 18){
        //     throw new UnderAgeStudentException("Age is less than 18,Not Allowed");
        // }
        
        
        // if (stu.getId() == 99){
        //     int k = 6/0;
        // }


        // if (stu.getId() % 2 != 0){
        //     throw new IllegalAccessException("Not a Even Number" + aCFG.getName());
        // }


        
        sRepo.save(stu);
        return stu;
    }

    public Optional<Student> findbyId(Long id) {
        return sRepo.findById(id);
    }
    
}
