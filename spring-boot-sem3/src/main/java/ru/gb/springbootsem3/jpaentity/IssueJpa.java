package ru.gb.springbootsem3.jpaentity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import ru.gb.springbootsem3.entity.Reader;

import java.awt.print.Book;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "issues")
public class IssueJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Id
    @Column(name = "id_reader")
    Reader reader;

    @Id
    @Column(name = "id_book")
    Book book;

    @DateTimeFormat
    @Column(name = "date_start")
    public String dateOfTook;

    @DateTimeFormat
    @Column(name = "date_end")
    public String dateOfReturnBook;


    public IssueJpa(Book book, Reader reader) {
        this.reader = reader;
        this.book = book;
    }

    public IssueJpa(Book book, Reader reader, String dateOfTook, String dateOfReturnBook) {
        this.reader = reader;
        this.book = book;
        this.dateOfTook = String.valueOf(LocalDate.now());
        this.dateOfReturnBook = String.valueOf(LocalDate.of(2024, 3, 31));
    }
}
