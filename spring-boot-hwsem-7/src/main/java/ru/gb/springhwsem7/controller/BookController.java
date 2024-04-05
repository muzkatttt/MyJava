package ru.gb.springhwsem7.controller;

import ru.gb.springhwsem7.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.springhwsem7.service.BookService;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("book")
public class BookController {
    //1.1 Реализовать контроллер по управлению книгами с ручками:
    //GET /book/{id} - получить описание книги,
    //DELETE /book/{id} - удалить книгу,
    //POST /book - создать книгу

    @Autowired
    private final BookService bookService;
    private static final Logger bookLog = LoggerFactory.getLogger(IssueController.class);

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(@RequestBody Book book) {
        bookLog.info("Выдать книгу с bookId={}", book.getId());
        try {
            List<Book> books = bookService.getAllBooks();
            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return ResponseEntity.notFound().build(); // 404
        }
    }


    //GET /book/{id} - получить описание книги
    @GetMapping("{id}")
    public ResponseEntity<Book> getById(@PathVariable long id) {
        Book book;
        try {
            book = bookService.getById(id);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Book>(HttpStatus.NOT_FOUND); // 404
        }
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }


    //POST /book - создать книгу
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }


    // DELETE /book/{id} - удалить книгу
    @DeleteMapping("{id}")
    public ResponseEntity<Book> deleteBookById(@PathVariable long id) {
        bookService.deleteBook(id);
        return new ResponseEntity<Book>(HttpStatus.OK);
    }

}
