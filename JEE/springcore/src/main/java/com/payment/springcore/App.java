package com.payment.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.payment.springcore.beans.AnotherObject;
import com.payment.springcore.beans.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Inversion of Control
        //Customer cust1 = (Customer) context.getBean("mycustomer");
        Customer cust1 = context.getBean("mycustomer",Customer.class);
        //System.out.println(cust1.toString());
        //cust1.setAge(100);
        //cust1.counter++;

        AnotherObject aO=context.getBean("aObj",AnotherObject.class);

        System.out.println(aO.toString());
        
        // Customer cust2 = context.getBean("mycustomer",Customer.class);
        // cust2.setAge(200);
        
        //cust2.counter++;
        // Customer cust3 = context.getBean("mycustomer",Customer.class);
        // cust3.setAge(300);
        //cust3.counter++;

        // System.out.println(cust1);
        // System.out.println(cust2);
        // System.out.println(cust3);

        //System.out.println(Customer.counter);
        
        //System.out.println(cust1.getAge());
        //System.out.println(cust1.getCustName());
        //System.out.println(cust1.getAct().toString());
       //Customer cust1 = new Customer();
        
       
       
       System.out.println( "Completed" );

       ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
