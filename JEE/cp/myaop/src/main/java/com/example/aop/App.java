package com.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.aop.bean.CustomerRegistration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        CustomerRegistration cReg = context.getBean("customerreg",CustomerRegistration.class);

        //cReg.addCustomer();

        //String result = cReg.addCustomerReturnValue();

        //System.out.println(cReg.addCustomerReturnValue());

        // cReg.addCustomerAround("Singapore");

        cReg.addCustomerThrowException();
    }
}
