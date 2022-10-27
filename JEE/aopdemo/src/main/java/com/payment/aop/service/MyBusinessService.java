package com.payment.aop.service;

public class MyBusinessService {
    

    public void doSomething(){
        System.out.println("### from Main Class Do Somethoing");
    }

    public String fetchSomething(){
        System.out.println("### from Main Class fetch Somethoing");
        return "super";
    }

    public String throwSomething() throws Exception{
        System.out.println("### from Main Class throw Somethoing");
        if (true) {
            throw new Exception("Invalid call");
        } else {
            return "Excellent";
        }
        
    }

    public Boolean validateSSNNumber(String ssn){
        String first3Chars = ssn.substring(0,3);
        String secondChars = first3Chars.concat("SuperStar");
        System.out.println("SSN..." + secondChars);
        return true;
    }
}
