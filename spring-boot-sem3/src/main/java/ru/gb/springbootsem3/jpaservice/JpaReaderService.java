package ru.gb.springbootsem3.jpaservice;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.springbootsem3.crudrepository.ReaderCrudRepository;
import ru.gb.springbootsem3.jpaentity.ReaderJpa;
import ru.gb.springbootsem3.jparepository.JpaReaderRepository;

import java.util.List;
import java.util.stream.StreamSupport;


//@Service
@RequiredArgsConstructor
public class JpaReaderService {
    private final JpaReaderRepository jpaReaderRepository;
    private final ReaderCrudRepository crudRepository;


    @EventListener(ContextRefreshedEvent.class)
    public void onCreateDatabase(){
        jpaReaderRepository.save(new ReaderJpa("Kate"));
        jpaReaderRepository.save(new ReaderJpa("Den"));
        jpaReaderRepository.save(new ReaderJpa("Masha"));
        jpaReaderRepository.save(new ReaderJpa("Ivan"));
    }

    public List<ReaderJpa> getAllReaders(){
        Iterable<ReaderJpa> iterable = jpaReaderRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false).toList();
    }
    public ReaderJpa getById(long id){
        return jpaReaderRepository.findById(id);
    }

    public ReaderJpa getByName(String name){
        return jpaReaderRepository.findByName(name);
    }

    public void deleteById(long id){
        jpaReaderRepository.deleteById(id);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public ReaderJpa updateReader(long id, String newName){
        ReaderJpa readerJpa = crudRepository.findById(id).orElseThrow();
        readerJpa.setName(newName);
        return crudRepository.save(readerJpa);
    }

}
