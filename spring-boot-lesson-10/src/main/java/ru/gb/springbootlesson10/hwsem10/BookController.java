package ru.gb.springbootlesson10.hwsem10;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping("book")
    public List<BookDto> getAllBooks(){
        return service.getAllBooks();
    }

    @GetMapping("{id}")
    public ResponseEntity<BookDto> getById(@PathVariable long id){
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
