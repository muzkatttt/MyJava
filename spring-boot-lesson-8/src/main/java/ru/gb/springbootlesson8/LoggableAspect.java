package ru.gb.springbootlesson8;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.event.Level;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
public class LoggableAspect {

    @Pointcut("within(@ru.gb.springbootlesson8.Loggable *)")
    public void beansMethod(){}

    @Pointcut("@annotation(ru.gb.springbootlesson8.Loggable)")
    public void beansWithAnnotation(){}

    @Around("beansMethod() || beansWithAnnotation()")
    public Object loggable(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Level level = extractLevel(proceedingJoinPoint);

        log.atLevel(level).log("target: " + proceedingJoinPoint.getTarget());
        log.atLevel(level).log("args: " + Arrays.toString(proceedingJoinPoint.getArgs()));
        log.atLevel(level).log("method: " + proceedingJoinPoint.getSignature());

        try {
            Object result = proceedingJoinPoint.proceed();
            return result;
        } catch (Throwable e){
            log.atLevel(level).log(e.getMessage());
        }
        return null;
    }

    private Level extractLevel(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Loggable annotation = signature.getMethod().getAnnotation(Loggable.class);
        if (annotation != null) {
            return annotation.level();
        }

        return joinPoint.getTarget().getClass().getAnnotation(Loggable.class).level();
    }
}
