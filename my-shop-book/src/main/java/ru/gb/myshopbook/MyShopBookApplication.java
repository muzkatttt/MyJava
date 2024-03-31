package ru.gb.myshopbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gb.myshopbook.model.Book;
import ru.gb.myshopbook.model.Issue;
import ru.gb.myshopbook.model.Reader;
import ru.gb.myshopbook.repository.BookRepository;
import ru.gb.myshopbook.repository.IssueRepository;
import ru.gb.myshopbook.repository.ReaderRepository;
import ru.gb.myshopbook.service.BookService;

@SpringBootApplication
public class MyShopBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyShopBookApplication.class, args);
	}

}
