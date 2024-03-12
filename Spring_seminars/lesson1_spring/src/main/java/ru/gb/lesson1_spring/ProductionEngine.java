package ru.gb.lesson1_spring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(("prod"))
public class ProductionEngine implements Engine1{
    public ProductionEngine() {
        System.out.println("Двигатель запущен на сервере!");
    }

    public void go(){
        System.out.println("Поехали быстро!");
    }


}
