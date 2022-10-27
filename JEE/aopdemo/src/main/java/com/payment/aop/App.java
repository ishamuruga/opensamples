package com.payment.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.payment.aop.service.MyBusinessService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

       MyBusinessService service = context.getBean("myservice",MyBusinessService.class);

       //service.doSomething();
        // try {
        //     service.throwSomething();
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("-------------Completed with Error");
        // }

        service.validateSSNNumber("1234567890ABCD");
       System.out.println("===================");

       //service.fetchSomething();
    }
}
