package com.mycompany.mybankapi.api;

import java.util.Arrays;
import java.util.List;

import com.mycompany.mybankapi.model.Student;

public abstract class BaseController {
    protected List<Student> getStudents(){
        return Arrays.asList(
            new Student("SuperStar","sstar@gmail.com"),
            new Student("UltimateStar","ustar@gmail.com"),
            new Student("PowerStar","pstar@gmail.com")
        );
    }
}
