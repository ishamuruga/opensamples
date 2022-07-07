package com.company.springhw.beans;

public class MyChildBean {
    private int age;
   
    private MyUtilBean utils;

    public int getAge(){
        return age;
    }


    public MyUtilBean getUtils() {
        return utils;
    }

    public void setUtils(MyUtilBean utils) {
        this.utils = utils;
    }

    public MyChildBean() {
        System.out.println("..........in Child Bean Cons");
    }

  

    @Override
    public String toString() {
        return "MyChildBean [age=" + age + ", utils=" + utils + "]";
    }


    public void setAge(int age) {
        this.age = age;
    }
}
