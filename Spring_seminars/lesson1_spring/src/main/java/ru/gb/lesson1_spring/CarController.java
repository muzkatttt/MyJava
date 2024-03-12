package ru.gb.lesson1_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// вместо @RestController можно сервис, контроллер или компонент
@RestController
public class CarController {

    //@Autowired // так лучше не делать, но для учебных целей мы делали на лекции
    Car car;

    @GetMapping("/car")
    public String startCar(){
        car.start();
        return "Автомобиль запущен";
    }
}
