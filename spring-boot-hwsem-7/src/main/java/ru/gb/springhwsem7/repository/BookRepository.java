package ru.gb.springhwsem7.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springhwsem7.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByName(String name);
}
