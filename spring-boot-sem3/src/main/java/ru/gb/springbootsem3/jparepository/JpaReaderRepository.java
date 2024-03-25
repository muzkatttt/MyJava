package ru.gb.springbootsem3.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springbootsem3.entity.Reader;

public interface JpaReaderRepository extends JpaRepository<Reader, Long> {

    Reader findById(long id);

    Reader findByName(String name);

}
