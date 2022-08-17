package com.company.spring.hw.bean;

import java.util.Date;

public class MyBean {

    private String type;

    private MyChildBean child;
    private My2ChildBean child2;
    private My3ChildBean child3;

    public MyBean(MyChildBean b1,My2ChildBean b2,String name){
        type = name;
        child = b1;
        child2 = b2;
    }

    public MyChildBean getChild() {
        return child;
    }

    public void setChild(MyChildBean child) {
        this.child = child;
    }

    

    public MyBean(){
        System.out.println("In MyBean Constructor");
    }

    public Date getDate() {
        return new Date();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void init(){
        System.out.println("######## Init");
    }

    public void destroy(){
        System.out.println("######## destroy");
    }

    public My2ChildBean getChild2() {
        return child2;
    }

    public void setChild2(My2ChildBean child2) {
        this.child2 = child2;
    }

    public My3ChildBean getChild3() {
        return child3;
    }

    public void setChild3(My3ChildBean child3) {
        this.child3 = child3;
    }


}
