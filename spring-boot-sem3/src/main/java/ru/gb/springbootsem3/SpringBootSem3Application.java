package ru.gb.springbootsem3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"/application.yaml"})
public class SpringBootSem3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSem3Application.class, args);
	}

}
