package com.mycompany.mybankapi.repo;

import com.mycompany.mybankapi.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student,Long> {
    
}


// JPA
// Hibernate
// SQL
// Database