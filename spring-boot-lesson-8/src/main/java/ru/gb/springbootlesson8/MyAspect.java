package ru.gb.springbootlesson8;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyAspect {

    //advice:
    //before
    //afterReturning
    //afterThrowing
    //after
    //around

    @Pointcut("execution(* ru.gb.springbootlesson8.MyServiceBean.*(..))")
    public void myServiceBeanMethods(){}

    @Before("myServiceBeanMethods()")
    public void before(JoinPoint joinPoint){
        System.out.println("args: " + Arrays.toString(joinPoint.getArgs()));
    }

//    @AfterReturning(value = "myServiceBeanMethods()", returning = "result")
//    public void afterReturning(JoinPoint joinPoint, Object result){
//        System.out.println("result: " + result);
//    }
//
//    @AfterThrowing(value = "myServiceBeanMethods()", throwing = "e")
//    public void afterThrowing(Throwable e){
//        System.out.println(e.getMessage());
//    }
//
//    @Around("myServiceBeanMethods()")
//    public Object around(ProceedingJoinPoint proceedingJoinPoint){
//        try {
//            Object result = proceedingJoinPoint.proceed();
//            return result;
//        } catch (Throwable e) {
//            System.out.println(e.getMessage());
//            return "было исключение";
//        }
//    }
}
