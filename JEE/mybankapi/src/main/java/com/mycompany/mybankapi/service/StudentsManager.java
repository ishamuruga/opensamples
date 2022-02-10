package com.mycompany.mybankapi.service;

import com.mycompany.mybankapi.exceptions.UnderAgeStudentException;
import com.mycompany.mybankapi.model.Student;

public interface StudentsManager {
    public Student add(Student stu) throws IllegalAccessException,UnderAgeStudentException;
}
