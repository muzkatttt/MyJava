package ru.gb.springhwsem7.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name ="books")
public class Book {

    public Book(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private final String name;
}

