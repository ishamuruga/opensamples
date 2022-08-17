package com.example.aop.bean;

public class CustomerRegistration {
    public void addCustomer(){
		System.out.println("addCustomer() is running <<");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running <<");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running <<");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name + "<<");
	}
}
