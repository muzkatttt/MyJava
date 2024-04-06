package ru.gb.springbootlesson8.hwsem8;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Hwsem8Aspect {
    @Pointcut("execution(* ru.gb.springbootlesson8.hwsem8..*(..))")
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

}
