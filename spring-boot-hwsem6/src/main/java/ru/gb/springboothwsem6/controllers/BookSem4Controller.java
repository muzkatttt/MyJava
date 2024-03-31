package ru.gb.springboothwsem6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.springboothwsem6.entity.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.springboothwsem6.services.BookService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("ui")
public class BookSem4Controller {
    // 1.1 /ui/books - на странице должен отобразиться список всех доступных книг в системе

    @GetMapping("book")
    public String books(Model model, @RequestParam BookService bookService){
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }

    @GetMapping("books")
    public String allBooks(Model model) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("War and World"));
        bookList.add(new Book("More"));
        bookList.add(new Book("Ocean"));
        model.addAttribute("books", bookList);
        return "books";
    }
}

