package ru.gb.springbootsem3.entity;

import lombok.Data;

@Data
public class Book {

    public Book(String name) {
        this.id = genId++;
        this.name = name;
    }

    private static long genId;
    private final long id;
    private final String name;
}
