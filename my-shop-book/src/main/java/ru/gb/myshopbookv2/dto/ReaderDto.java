package ru.gb.myshopbookv2.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReaderDto {
    private long id;
    @NotNull
    private String name;
}
