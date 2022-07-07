package com.company.aop;

import com.company.aop.impl.MyAdhaarValidatorManager;
import com.company.aop.impl.MyAnotherPrg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        MyAdhaarValidatorManager service = (MyAdhaarValidatorManager) context.getBean("adhaarImpl");

        MyAnotherPrg otherPrg = (MyAnotherPrg)context.getBean("anotherImpl");



        service.addAdhaar();

        System.out.println("===================================");

        otherPrg.addAdhaar2();
        
        //service.getAdhaarThrowsException();

        //String result = service.getAdhaarAround("12345");

        //String result = service.getAdhaarAround("1234 3434343");

        //System.out.println(result);

        System.out.println( "===Completed" );
    }
}
