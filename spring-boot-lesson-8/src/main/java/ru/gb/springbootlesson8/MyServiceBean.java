package ru.gb.springbootlesson8;

import org.springframework.stereotype.Component;

@Component
public final class MyServiceBean implements MyServiceInterface{

    public String method1(String arg){
        System.out.println("работа метода 1");
        method2(arg);
        return "result";
    }

    public String method2(String arg){
        System.out.println("работа метода 2");
        return "result";
    }

//    public void method3(){
//        throw new RuntimeException("exception!");
//    }
}
