package ru.gb.springbootsem3.jpaservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.springbootsem3.jparepository.JpaBookRepository;

import java.awt.print.Book;

@Service
@RequiredArgsConstructor
public class JpaBookService {

    private final JpaBookRepository repository;

    public Book getById(long id){
        return repository.findById(id);
    }

    public Book getByName(String name){
        return repository.findByName(name);
    }

    public Book createBook(){
        return repository.createBook();
    }
}
