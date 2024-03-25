package ru.gb.springbootsem3.jparepository;


import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.print.Book;


public interface JpaBookRepository extends JpaRepository<Book, Long> {
    Book findById(long id);

    Book findByName(String name);
}
