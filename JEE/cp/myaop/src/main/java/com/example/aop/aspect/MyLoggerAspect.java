package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyLoggerAspect {
    
    @Before("execution(* com.example.aop.bean.CustomerRegistration.addCustomer(..))")
    // @Before("execution(* com.example.aop.bean.*.*(..))")
    public void doBeforeCallingAMethod(JoinPoint jp){
        System.out.println("#### In BEFORE ASPECT");
        System.out.println(jp.getSignature().getName());
        System.out.println("###############END");
    }

    @After("execution(* com.example.aop.bean.CustomerRegistration.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}


    @AfterThrowing(
			pointcut = "execution(* com.example.aop.bean.CustomerRegistration.addCustomerThrowException(..))",
			throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");

	}
	


    @Around("execution(* com.example.aop.bean.CustomerRegistration.addCustomerAround(..))")
    public void getTimeDifference(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("#### in Around Advice");

        Long l = System.currentTimeMillis();

        String args= pjp.getArgs()[0].toString();

        if (args.equalsIgnoreCase("India")){
            pjp.proceed();
        } else {
            System.out.println("Fall Back Method");
        }

        System.out.println("Time Diff is.." + (System.currentTimeMillis() - l));
    }
}
