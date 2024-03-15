package ru.gb.springbootlesson2;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) SpringApplication.run(Application.class, args);

//		UserRepository repository = new UserRepository();
//		System.out.println(repository.getAll());

//		UserRepository userRepository1 = context.getBean("myUserRepository", UserRepository.class);
//		UserRepository userRepository2 = context.getBean("newBeanName", UserRepository.class);
//
//		System.out.println(userRepository1 == userRepository2);
	}
}
