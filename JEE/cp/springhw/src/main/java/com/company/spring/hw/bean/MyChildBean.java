package com.company.spring.hw.bean;

public class MyChildBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyChildBean [name=" + name + "]";
    }

    
}
