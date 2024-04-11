package ru.gb.book_service;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("book")
public class BookController {
    private List<Book> books;

    @PostConstruct
    public void generatedBooks(){
        books = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Book book = new Book();
            book.setId(UUID.randomUUID());
            book.setName("Book " + i);

            books.add(book);
        }
    }
    @GetMapping("all")
    public List<Book> getAllBooks(){
        return books;
    }

    @GetMapping("random")
    public Book getById(@PathVariable UUID id){
        Random rand = new Random();
        return books.get(rand.nextInt(books.size()));
//        return books.stream()
//                .filter(book  -> id == book.getId())
//                .findFirst()
//                .orElse(null);
    }



}
