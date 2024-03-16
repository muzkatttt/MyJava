package ru.gb.lesson1_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson1SpringApplication {

	// аннотация  @Autowired запустит объект класса Engine
	@Autowired
	Engine engine;

	CarController carController;
	// внедряем зависимости через контруктор, но в данном семинаре создадим через setter в классе Car
	//public static void main(String[] args) {
//		SpringApplication.run(Lesson1SpringApplication.class, args);
//	}
	//Car car = new Car(new Engine()); // если используется конструктор который закомментировал
}
