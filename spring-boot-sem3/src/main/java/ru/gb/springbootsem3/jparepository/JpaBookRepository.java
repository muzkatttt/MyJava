package ru.gb.springbootsem3.jparepository;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;


@Repository
public interface JpaBookRepository extends JpaRepository<Book, Long> {
    Book findById(long id);

    Book findByName(String name);

    Book createBook();
}
