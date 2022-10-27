package com.payment.aop.myaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;

@Aspect
public class MyLoggerAspect {

    //@Before("execution(* com.payment.aop.service.MyBusinessService.doSomething(..))")
    @Before("execution(* com.payment.aop.service.MyBusinessService.*(..))")
    public void logBefore(JoinPoint jp){
        System.out.println(">> THis is COming from Before Aspect");
        System.out.println(">> The method name is..." + jp.getSignature().getName());
        System.out.println("**********");
    }

    @After("execution(* com.payment.aop.service.MyBusinessService.*(..))")
    public void logAfter(JoinPoint jp){
        System.out.println("## THis is COming from After Aspect");
        System.out.println("**********");
    }


    @AfterThrowing(
        pointcut = "execution(* com.payment.aop.service.MyBusinessService.throwSomething(..))",
        throwing = "error")
    public void logAfterThrowing(JoinPoint jp,Throwable error) {
        System.err.println("$$ Error Custom Processing");
        System.err.println("The Error is.." + error.toString());
        System.err.println("%%%%%%%%%%%%%");
    }

    @Around("execution(*  com.payment.aop.service.MyBusinessService.validateSSNNumber(..))")
    public void alterSSNValidateFunctionality(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("## Around Advice is Activated");

        String args = jp.getArgs()[0].toString();

        if (args.equalsIgnoreCase("1234567890")){
            jp.proceed();
        } else {
            System.out.println("=====================================");
            System.out.println("==================FalBack============");
            System.out.println("Functional getting altered");
            System.out.println("#####################################");


            
        }
    }

    
}
