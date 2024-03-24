package ru.gb.springbootsem3.entity;

import lombok.Data;

@Data
public class Reader {

    public Reader(String name) {
        this.id = genId++;
        this.name = name;
    }

    private static long genId;
    private final long id;
    private final String name;
}
