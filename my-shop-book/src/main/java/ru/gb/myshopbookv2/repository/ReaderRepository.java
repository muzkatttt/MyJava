package ru.gb.myshopbookv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.myshopbookv2.model.Reader;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
