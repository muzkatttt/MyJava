package ru.gb.myshopbookv2.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.gb.myshopbookv2.model.Book;
import ru.gb.myshopbookv2.model.Reader;

import java.time.LocalDateTime;

@Data
public class IssueDto {
    private long id;
    @NotNull
    private Reader reader;
    @NotNull
    private Book book;
    private LocalDateTime issuedAt;
    private LocalDateTime returnedAt;
}
