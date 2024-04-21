package ru.gb.springhwsem7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootHwSem7Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootHwSem7Application.class, args);
	}
}
