package ru.gb.springbootlesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLesson8Application {

	// OOP (object oriented programming)
	// AOP (aspect oriented programming)

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLesson8Application.class, args);

//		MyServiceInterface bean = context.getBean(MyServiceInterface.class);
//		System.out.println(bean.getClass().getName());
//		bean.method1("test");

		Volvo volvo = context.getBean(Volvo.class);
		volvo.method1("test");
		volvo.method2();
		volvo.method3();
	}

	//method1 -> Proxy[MyServiceBean -> method1 -> method2]
	//DynamicProxy implements..
}

