package com.gb;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect {
    @Before("execution(* ru.gb.bookService.springhwsem12.BookController.generatedBooks())")
    public void before(JoinPoint joinPoint) throws Exception{
        log.info("classname: " + joinPoint.getClass().getName());

    }
}
