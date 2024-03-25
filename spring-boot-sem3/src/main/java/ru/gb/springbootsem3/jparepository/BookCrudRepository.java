package ru.gb.springbootsem3.jparepository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.springbootsem3.entity.Book;

public interface BookCrudRepository extends CrudRepository<Book, Long> {
}
