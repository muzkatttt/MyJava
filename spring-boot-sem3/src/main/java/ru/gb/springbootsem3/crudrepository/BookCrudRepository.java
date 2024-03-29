package ru.gb.springbootsem3.crudrepository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.springbootsem3.jpaentity.BookJpa;

public interface BookCrudRepository extends CrudRepository<BookJpa, Long> {
}
