package ru.gb;

import lombok.Data;

import java.util.UUID;

@Data
public class Book {
    private UUID id;
    String name;
}
