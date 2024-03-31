package ru.gb.myshopbook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.gb.myshopbook.model.Book;
import ru.gb.myshopbook.service.BookService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("{id}")
    public ResponseEntity<Book> findById(@PathVariable long id){
        return ResponseEntity.ok().body(bookService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAll(){
        return ResponseEntity.ok().body(bookService.findAll());
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book createdBook = bookService.createBook(book);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdBook.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdBook);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable long id){
        bookService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Book> updateBook(@PathVariable long id, @RequestBody Book book){
        return ResponseEntity.ok().body(bookService.updateBook(id, book));
    }
}
