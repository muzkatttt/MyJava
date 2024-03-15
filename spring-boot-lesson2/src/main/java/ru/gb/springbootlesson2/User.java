package ru.gb.springbootlesson2;

import lombok.Data;

@Data
public class User {
    private static long curId = 0;
    private final long id;
    private final String name;

    public User(String name) {
        this.id = curId++;
        this.name = name;
    }
}
