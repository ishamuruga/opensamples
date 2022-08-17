package com.company.spring.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.spring.hw.bean.MyBean;
import com.company.spring.hw.bean.MyConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        //MyBean mb = new MyBean();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //MyBean mbean = context.getBean("superbean", MyBean.class);

        //Car c = mysteriousfn.createObject("Car");
        //MyBean mbean1 = (MyBean)context.getBean("superbean2");


        //System.out.println(mbean1.getDate());
        //System.out.println(mbean1.getType());
        //System.out.println(mbean1.getChild());
        //System.out.println(mbean1.getChild2());

        MyConfig myCfg = context.getBean("cfg",MyConfig.class);

        System.out.println(myCfg.locations);

        ((AbstractApplicationContext)context).registerShutdownHook();

    }
}
