package ru.gb.springbootlesson3.entity;

import lombok.Data;

@Data
public class Reader {
    private static long genId;

    private final long id;
    private final String name;

    public Reader(String name) {
        id = genId++;
        this.name = name;
    }
}
