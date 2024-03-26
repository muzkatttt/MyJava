package ru.gb.springbootsem3.jpaentity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "issues")
public class IssueJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Id
    @Column(name = "idReader")
    private long idReader;

    @Id
    @Column(name = "idBook")
    private long idBook;

    @DateTimeFormat
    @Column(name = "date_start")
    public String dateOfTook;

    @DateTimeFormat
    @Column(name = "date_end")
    public String dateOfReturnBook;


    public IssueJpa(long idReader, long idBook) {
        this.idReader = idReader;
        this.idBook = idBook;
    }

    public IssueJpa(long idBook, long idReader, String dateOfTook, String dateOfReturnBook) {
        this.idBook = idBook;
        this.idReader = idReader;
        this.dateOfTook = String.valueOf(LocalDate.now());
        this.dateOfReturnBook = String.valueOf(LocalDate.of(2024, 3, 31));
    }
}
