package ru.gb.springbootsem3.jparepository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.springbootsem3.entity.Reader;

public interface ReaderCrudRepository extends CrudRepository<Reader, Long> {

}
