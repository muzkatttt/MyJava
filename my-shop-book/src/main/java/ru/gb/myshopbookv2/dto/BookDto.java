package ru.gb.myshopbookv2.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(name = "Книга")
public class BookDto {
    @Schema(name = "Идентификатор", minimum = "0")
    private long id;
    @NotNull
    @Schema(name = "Название книги")
    private String name;
}
//localhost:8080/group/{id}/student 404
//localhost:8080/student?group=id 203
//CRUD

