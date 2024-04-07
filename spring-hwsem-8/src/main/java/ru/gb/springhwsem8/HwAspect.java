package ru.gb.springhwsem8;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Slf4j
public class HwAspect {

    @Before("execution(* ru.gb.springhwsem8.MyHwBean.sum())")
    public void before(JoinPoint joinPoint) throws Exception{
        log.info("classname: " + joinPoint.getClass().getName());

    }
}
