package ru.gb.springbootsem3.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springbootsem3.jpaentity.ReaderJpa;


public interface JpaReaderRepository extends JpaRepository<ReaderJpa, Long> {

    ReaderJpa findById(long id);

    ReaderJpa findByName(String name);

}
