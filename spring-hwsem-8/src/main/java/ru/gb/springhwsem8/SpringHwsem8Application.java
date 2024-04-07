package ru.gb.springhwsem8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringHwsem8Application {

	public static void main(String[] args) throws InterruptedException {

	ConfigurableApplicationContext context = SpringApplication.run(SpringHwsem8Application.class, args);
	MyHwBean bean = context.getBean(MyHwBean.class);
	bean.sum();
	bean.factorial(20);

	}
}
