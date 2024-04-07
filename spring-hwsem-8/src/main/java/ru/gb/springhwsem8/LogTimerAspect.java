package ru.gb.springhwsem8;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogTimerAspect {

    //className - methodName #(количество секунд выполнения) - записать в лог

    //private static final Logger log = LoggerFactory.getLogger(LogTimerAspect.class); // @Slf4j - заменяет применение
    @Around("execution(* ru.gb.springhwsem8.MyHwBean.sum())")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        log.info("className:{} - methodName {} #(количество секунд выполнения) {} мс", joinPoint.getClass().getName().getClass(),
                joinPoint.getSignature(), System.currentTimeMillis() - startTime);
        return result;
    }

    @Around("execution(* ru.gb.springhwsem8.*.*(..))")
    public Object aroundMethodFact(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        log.info("Время выполнения метода {} заняло {} мс.", joinPoint.getSignature(), System.currentTimeMillis() - startTime);
        return result;
    }
}
