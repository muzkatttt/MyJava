package ru.gb.lesson1_spring;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile(("local"))
public class LocalEngine implements Engine1{
    public LocalEngine() {
        System.out.println("Двигатель запущен на моем ноутбуке!");
    }

    public void go(){
        System.out.println("Поехали медленно!");
    }


}
