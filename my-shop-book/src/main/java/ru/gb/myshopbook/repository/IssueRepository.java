package ru.gb.myshopbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.myshopbook.model.Issue;
import ru.gb.myshopbook.model.Reader;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
    long countByReaderAndReturnedAtIsNull(Reader reader);
}
