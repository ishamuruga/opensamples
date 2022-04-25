package com.company.springhw;

import com.company.springhw.beans.MyBean;
import com.company.springhw.beans.MyChildBean2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        

        //IOC
       // MyBean myBean1 = (MyBean)context.getBean("superstar");
        //System.out.println(myBean1.getMessage());
        //System.out.println(my//Bean1);

        //System.out.println("================");
        //IOC
        //MyBean myBean2 = (MyBean)context.getBean("superstar");

        //System.out.println(myBean2);

        MyChildBean2 ch2 = (MyChildBean2)context.getBean("manicbasha");
        System.out.println(ch2);

        System.out.println("...Completed");

        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
