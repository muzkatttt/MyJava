package ru.gb.myshopbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.myshopbook.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
