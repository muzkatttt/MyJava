package ru.gb.myshopbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.myshopbook.model.Reader;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
