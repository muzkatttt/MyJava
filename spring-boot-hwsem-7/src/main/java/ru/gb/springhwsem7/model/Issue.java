package ru.gb.springhwsem7.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Issue {

    private static long genId;
    private final long id;
    private final long idReader;
    private final long idBook;
    public String dateOfTook;
    public String dateOfReturnBook;


    public Issue(long idReader, long idBook) {
        id = genId++;
        this.idReader = idReader;
        this.idBook = idBook;
    }

    public Issue(long idBook, long idReader, String dateOfTook, String dateOfReturnBook) {
        id = genId++;
        this.idBook = idBook;
        this.idReader = idReader;
        this.dateOfTook = String.valueOf(LocalDate.now());
        this.dateOfReturnBook = String.valueOf(LocalDate.now());
    }
}
