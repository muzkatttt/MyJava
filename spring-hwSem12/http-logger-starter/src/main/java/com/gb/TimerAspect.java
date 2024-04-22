package com.gb;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@EnableAspectJAutoProxy
public class TimerAspect {
    @Pointcut("execution(* ru.gb.springhwsem12.*.*(..))")
    public void myHwBeanTimerMethods() {
    }

    @Around("myHwBeanTimerMethods()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        log.info("className:{} - methodName {} #(количество секунд выполнения) {} мс", joinPoint.getClass().getName().getClass(),
                joinPoint.getSignature(), System.currentTimeMillis() - startTime);
        return result;
    }



}
