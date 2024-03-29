package ru.gb.springbootsem3.crudrepository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.springbootsem3.jpaentity.ReaderJpa;

public interface ReaderCrudRepository extends CrudRepository<ReaderJpa, Long> {

}
