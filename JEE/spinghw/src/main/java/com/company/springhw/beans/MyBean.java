package com.company.springhw.beans;

public class MyBean {

    private MyChildBean child;

    private MyUtilBean utils;

    public MyUtilBean getUtils() {
        return utils;
    }

    public void setUtils(MyUtilBean utils) {
        this.utils = utils;
    }

    public MyBean(){
        System.out.println("=============In Constructor");
    }

    private String message;

    public MyChildBean getChild() {
        return child;
    }

    public void setChild(MyChildBean child) {
        this.child = child;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message.concat("to Spring Framework");
    }



    @Override
    public String toString() {
        return "MyBean [child=" + child + ", message=" + message + ", utils=" + utils + "]";
    }

    //LifeCycles
    public void init() {
        System.out.println("................INIT");
    }

    public void destroy() {
        System.out.println("..................DESTROY");
    }
 
    
}
