package ru.gb.myshopbookv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gb.myshopbookv2.config.IssueProperties;

@SpringBootApplication
public class MyShopBookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyShopBookApplication.class, args);

		IssueProperties bean = context.getBean(IssueProperties.class);
		System.out.println(bean.getMaxAllowedBooks());
	}

}
