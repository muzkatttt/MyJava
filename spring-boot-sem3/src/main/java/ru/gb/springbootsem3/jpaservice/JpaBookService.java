package ru.gb.springbootsem3.jpaservice;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import ru.gb.springbootsem3.jpaentity.BookJpa;
import ru.gb.springbootsem3.jparepository.JpaBookRepository;

import java.util.List;
import java.util.stream.StreamSupport;

//@Service
@RequiredArgsConstructor
public class JpaBookService {

    private final JpaBookRepository repository;

    @EventListener(ContextRefreshedEvent.class)
    public void onCreateDatabase(){
        repository.save(new BookJpa("Evgeniy Onegin"));
        repository.save(new BookJpa("Kolobok"));
        repository.save(new BookJpa("Masha"));
        repository.save(new BookJpa("Mu Mu"));
    }

    public List<BookJpa> getAllBooks(){
        Iterable<BookJpa> iterable = repository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false).toList();
    }
    public BookJpa getById(long id){
        return repository.findById(id);
    }

    public BookJpa getByName(String name){
        return repository.findByName(name);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }


}
