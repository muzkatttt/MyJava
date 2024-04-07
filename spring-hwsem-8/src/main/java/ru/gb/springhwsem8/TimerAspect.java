package ru.gb.springhwsem8;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.Jar;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@EnableAspectJAutoProxy
public class TimerAspect {

    //className - methodName #(количество секунд выполнения) - записать в лог

    //private static final Logger log = LoggerFactory.getLogger(LogTimerAspect.class); // @Slf4j - замена

    // вариант 1
    @Pointcut("execution(* ru.gb.springhwsem8.*.*(..))")
    public void myHwBeanMethods() {
    }

    @Around("myHwBeanMethods()")
    @Order(1)
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        log.info("className:{} - methodName {} #(количество секунд выполнения) {} мс", joinPoint.getClass().getName().getClass(),
                joinPoint.getSignature(), System.currentTimeMillis() - startTime);
        return result;
    }


    @AfterThrowing(value = "myHwBeanMethods()", throwing = "e")
    public void afterThrowing(Throwable e) {
        log.info("throwable: {}", e.getMessage());
    }


    // вариант 2 без pointcut
    @Around("execution(* ru.gb.springhwsem8.*.*(..))")
    @Order(2)
    public Object aroundMethod2(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.info("Время выполнения метода {} - {} заняло # {} ms", className, methodName, executionTime);
        return result;
    }
}


