package com.company.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
  
    
    @Before("execution(* com.company.aop.impl.*.*(..))")
    public void logBefore(JoinPoint jp) {
        System.out.println("==> Log Before is added to the code1");
        System.out.println("==> Log Before is added to the code2.." + jp.getSignature().getName());
        System.out.println("==> aspect Completed");
    }


    // @Before("execution(* com.company.aop.impl.MyAdhaarValidatorImpl.addAdhaar(..))")
    // public void logBefore(JoinPoint jp) {
    //     System.out.println("==> Log Before is added to the code1");
    //     System.out.println("==> Log Before is added to the code2.." + jp.getSignature().getName());
    //     System.out.println("==> aspect Completed");
    // }

    @After("execution(* com.company.aop.impl.MyAdhaarValidatorImpl.addAdhaar(..))")
    public void logAfter(JoinPoint jp) {
        System.out.println("==> Log After is added to the code1");
        System.out.println("==> Log After is added to the code2.." + jp.getSignature().getName());
        System.out.println("==> aspect Completed");
    }

    @AfterThrowing(
        pointcut="execution(* com.company.aop.impl.MyAdhaarValidatorImpl.getAdhaarThrowsException(..))",
        throwing="th"
    )
    public void logAfterException(JoinPoint jp,Throwable th) {
        System.out.println("==> Log After exception is added to the code");
        System.out.println("==> Log After is added to the code2.." + jp.getSignature().getName());
        System.err.println("Error.." + th.toString());
        System.out.println("==> aspect Completed");
    }

    @Around("execution(* com.company.aop.impl.MyAdhaarValidatorImpl.getAdhaarAround(..))")
    public void logAfterException(ProceedingJoinPoint jp) {
        System.out.println("==> Around aspect is added to the code");

        String arg="";

        arg = jp.getArgs()[0].toString();

        if (arg.equalsIgnoreCase("12345")) {
            try {
                jp.proceed();
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println(" ******* Alternate Flow Method ******");
        }

        System.out.println("==> aspect Completed");
    }

}
