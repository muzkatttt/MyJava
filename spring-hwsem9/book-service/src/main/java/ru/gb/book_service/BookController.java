package ru.gb.book_service;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("book")
public class BookController {
    private List<Book> books = new ArrayList<>();

    @PostConstruct
    public void generatedBooks(){
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

    @GetMapping("{id}")
    public Book getById(@PathVariable UUID id){
        return books.stream()
                .filter(book  -> id == book.getId())
                .findFirst()
                .orElse(null);
    }



}
