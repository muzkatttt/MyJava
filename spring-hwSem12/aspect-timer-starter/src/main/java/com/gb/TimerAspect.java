package com.gb;

import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class TimerAspect {

    @Pointcut("within(@com.gb.annotation.Timer *)") // если над бином будет аннотация @Timer
    public void myBeanWithTimerAnnotation() {
    }

    @Pointcut("@annotation(com.gb.annotation.Timer)")
    public void myMethodsWithTimerAnnotation() { // если над методом будет аннотация @Timer
    }

    // мой аспект замера времени выполнения бина или метода
    @Around("myBeanWithTimerAnnotation() || myMethodsWithTimerAnnotation()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        log.info("className:{} - methodName {} #(количество секунд выполнения) {} мс",
                joinPoint.getClass().getName().getClass(),
                joinPoint.getSignature(), System.currentTimeMillis() - startTime);
        return result;
    }
}
