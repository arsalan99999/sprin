package com.example.aop.aspect;

import com.example.aop.annotation.LogExecutionTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@EnableAspectJAutoProxy
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

//    @Before("execution(* com.example.aop.service.PaymentService.makePayment())")
//    public void before(JoinPoint joinPoint){
//        System.out.println("Before Method invoked:: " + joinPoint.getSignature());
//    }

    @Around("@annotation(com.example.aop.annotation.LogExecutionTime)")
    public void executionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Method invoked:: " + joinPoint.getSignature());
        System.out.println(joinPoint.proceed());
        System.out.println("After Method invoked:: " + joinPoint.getSignature());
    }



//
//    @After("loggingPointCut()")
//    public void after(JoinPoint joinPoint){
//        System.out.println("After Method invoked:: " + joinPoint.getSignature());
//    }
//
//    @Around("execution(* com.example.aop.service.PaymentService.makePayment())")
//    public Object logMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable {
//        // Before method execution
//        System.out.println("Before executing method: " + joinPoint.getSignature().toShortString());
//        Object result = null;
//
//        try {
//            // Proceed with the original method execution
//            result = joinPoint.proceed();
//
//            // After method execution (if successful)
//            System.out.println("After executing method: " + joinPoint.getSignature().toShortString());
//        } catch (Exception e) {
//            // After method execution in case of an exception
//            System.out.println("Exception occurred during method execution: " + e.getMessage());
//            throw e; // Re-throw the exception
//        }
//        // Return the result (either the actual result or a default value)
//        return result;
//    }
}
