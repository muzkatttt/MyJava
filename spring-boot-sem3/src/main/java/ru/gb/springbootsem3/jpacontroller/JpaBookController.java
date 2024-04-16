package ru.gb.springbootsem3.jpacontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.springbootsem3.jpaentity.BookJpa;
import ru.gb.springbootsem3.jpaservice.JpaBookService;

import java.util.List;

//@RestController

public class JpaBookController {
    private final JpaBookService jpaBookService;

    public JpaBookController(JpaBookService jpaBookService) {
        this.jpaBookService = jpaBookService;
    }

    @GetMapping("books")
    public List<BookJpa> getAllBooks(){
        return jpaBookService.getAllBooks();
    }

    @GetMapping("book/{name}")
    public BookJpa findBookByName(@RequestParam String name){
        return jpaBookService.getByName(name);
    }

    @GetMapping("book")
    public BookJpa findBookById(@RequestParam long id){
        return jpaBookService.getById(id);
    }


    @GetMapping("book/delete")
    public void deleteBookById(long id){
        jpaBookService.deleteById(id);
    }

}
