package ru.gb.springbootsem3.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
public class MyBean {
    private static final Logger log = (Logger) LoggerFactory.getLogger(MyBean.class);

    public MyBean() {
    }

    @PostConstruct
    public void postConstruct() {
        log.info("post construct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("pre destroy");
    }

    @EventListener // (ContextRefreshedEvent.class) - действие сработает, когда все бины подняты
    // - можно поставить в качестве аргумента в метод
    public void myEvent(MyEvent event) {
        log.info("Поймал событие");
    }
}