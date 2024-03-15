package ru.gb.lesson1_spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Engine {
    public Engine() {
        System.out.println("Двигатель запущен!");
    }

    public void go(){
        System.out.println("Поехали!");
    }


}
