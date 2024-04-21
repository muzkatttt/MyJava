package ru.gb.springhwsem7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springhwsem7.model.Reader;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long>{
    Reader findByName(String name);
}

