package ru.gb.springbootsem3.jpaservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.springbootsem3.entity.Reader;
import ru.gb.springbootsem3.jparepository.JpaReaderRepository;


@Service
@RequiredArgsConstructor
public class JpaReaderService {
    private final JpaReaderRepository jpaReaderRepository;

    Reader getById(long id){
        return jpaReaderRepository.findById(id);
    }

    Reader getByName(String name){
        return jpaReaderRepository.findByName(name);
    }
}
