package com.mycompany.mybankapi.api;

import java.util.Arrays;
import java.util.List;

import com.mycompany.mybankapi.model.Student;

public abstract class BaseController {
    protected List<Student> getStudents(){
        return Arrays.asList(
            new Student(1,"SuperStar","sstar@gmail.com"),
            new Student(2,"UltimateStar","ustar@gmail.com"),
            new Student(3,"PowerStar","pstar@gmail.com")
        );
    }
}
