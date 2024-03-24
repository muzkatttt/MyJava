package ru.gb.springbootsem3.controllers;


import ru.gb.springbootsem3.entity.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("ui")
public class BookSem4Controller {
    // 1.1 /ui/books - на странице должен отобразиться список всех доступных книг в системе

    @GetMapping("ui/books")
    public String getAllBooks(Model model, @RequestParam Book book){
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bookList.add(book);
        }
        model.addAttribute("ui/books", bookList);
        return "ui/books";
    }

    @GetMapping("books")
    public String books(Model model){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Small prince"));
        bookList.add(new Book("War and World"));
        bookList.add(new Book("Black and White"));
        model.addAttribute("books", bookList);
        return "books";
    }

}
