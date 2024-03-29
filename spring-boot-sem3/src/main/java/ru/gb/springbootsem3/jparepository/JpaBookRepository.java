package ru.gb.springbootsem3.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.springbootsem3.jpaentity.BookJpa;


@Repository
public interface JpaBookRepository extends JpaRepository<BookJpa, Long> {
    BookJpa findById(long id);

    BookJpa findByName(String name);

    BookJpa createBook();
}
