package ru.gb.springbootlesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootLesson11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLesson11Application.class, args);
	}

}
