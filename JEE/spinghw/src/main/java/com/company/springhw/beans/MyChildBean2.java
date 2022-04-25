package com.company.springhw.beans;

public class MyChildBean2 {
    private int age;

    private int type;

    
   
    public int getType() {
        return type;
    }


    public void setType(int type) {
        this.type = type;
    }


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

    public MyChildBean2() {
        System.out.println("..........in Child Bean Cons");
    }

  



    @Override
    public String toString() {
        return "MyChildBean2 [age=" + age + ", type=" + type + ", utils=" + utils + "]";
    }


    public void setAge(int age) {
        this.age = age;
    }
}
