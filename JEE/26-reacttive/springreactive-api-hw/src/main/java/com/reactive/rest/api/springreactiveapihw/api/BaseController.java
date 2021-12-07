package com.reactive.rest.api.springreactiveapihw.api;

import java.util.ArrayList;
import java.util.List;

import com.reactive.rest.api.springreactiveapihw.model.AddStudent;

public abstract class BaseController {
    protected List<AddStudent> getTestsStudets(){
        List<AddStudent> lstStu = new ArrayList<>();

        for(int i=0;i<10;i++){
            lstStu.add(new AddStudent(i,"name"+i,"name"+i + "@gmail.com"));
        }
        return lstStu;
        
    }
}
