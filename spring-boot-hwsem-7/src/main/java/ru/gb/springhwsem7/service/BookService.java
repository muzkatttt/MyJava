package ru.gb.springhwsem7.service;

import lombok.RequiredArgsConstructor;
import ru.gb.springhwsem7.model.Book;
import org.springframework.stereotype.Service;
import ru.gb.springhwsem7.repository.BookRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BookService {

    public Book findById(Long id){
        return repository.findById(id).orElse(null);
    }
    public void addNewBook(String name){
        repository.save(new Book(name));
    }
    public void deleteById(Long id){
        repository.deleteById(id);
    }
    public List<Book> getAll(){
        return repository.findAll();
    }
    public Book findByName(String name){
        return repository.findByName(name);
    }
    private final BookRepository repository;


}

