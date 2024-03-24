package ru.gb.springbootsem3.entity;

import lombok.Data;

@Data
public class Issue {

    private static long genId;
    private final long id;
    private final long idReader;
    private final long idBook;

    public Issue(long idReader, long idBook) {
        id = genId++;
        this.idReader = idReader;
        this.idBook = idBook;
    }
}
