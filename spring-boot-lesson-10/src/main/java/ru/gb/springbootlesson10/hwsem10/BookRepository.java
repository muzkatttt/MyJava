package ru.gb.springbootlesson10.hwsem10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.gb.springbootlesson10.hwsem10.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
