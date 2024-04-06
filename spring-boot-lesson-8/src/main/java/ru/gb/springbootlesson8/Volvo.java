package ru.gb.springbootlesson8;

import org.slf4j.event.Level;
import org.springframework.stereotype.Component;

@Component

public class Volvo {
    public void method1(String args){
        System.out.println("работа метода 1");
    }


    public String method2(){
        System.out.println("работа метода 2");
        return "result";
    }
    @Loggable(level = Level.WARN)
    public void method3(){
        System.out.println("работа метода 3");
        throw new RuntimeException("Ошибка в методе 3");
    }
}
