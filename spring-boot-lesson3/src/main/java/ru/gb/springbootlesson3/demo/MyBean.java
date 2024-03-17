package ru.gb.springbootlesson3.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Scope("prototype")
public class MyBean {

    @PostConstruct
    public void postConstruct(){
        log.info("post construct");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("pre destroy");
    }

    @EventListener()
    public void myEvent(MyEvent event){
        log.info("Поймал событие");
    }
}
