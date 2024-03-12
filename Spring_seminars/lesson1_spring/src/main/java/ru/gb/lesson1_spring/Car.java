package ru.gb.lesson1_spring;

import org.springframework.stereotype.Service;

@Service
public class Car {
    Engine engine;

//    public Car(Engine engine) {
//        this.engine = engine;
//        engine.go();
//    }


    public Car() {
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.go();
    }
}

