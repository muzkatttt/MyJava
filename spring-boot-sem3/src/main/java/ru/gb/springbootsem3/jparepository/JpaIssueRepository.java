package ru.gb.springbootsem3.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springbootsem3.jpaentity.BookJpa;
import ru.gb.springbootsem3.jpaentity.IssueJpa;
import ru.gb.springbootsem3.jpaentity.ReaderJpa;

public interface JpaIssueRepository extends JpaRepository<IssueJpa, Long> {

    IssueJpa findById(long id);

    IssueJpa findByIdBook(long id);

    IssueJpa findByIdReader(long id);

    IssueJpa findByBookName(BookJpa book);

    IssueJpa findByReaderName(ReaderJpa reader);
}
