package com.mycompany.mybankapi.repo;

import com.mycompany.mybankapi.model.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    
}
