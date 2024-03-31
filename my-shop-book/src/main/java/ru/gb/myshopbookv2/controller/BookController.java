package ru.gb.myshopbookv2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.gb.myshopbookv2.dto.BookDto;
import ru.gb.myshopbookv2.service.BookService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("{id}")
    public ResponseEntity<BookDto> findById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findById(id));
    }

    @Operation(summary = "get all persons", description = "Загружает всех пользоватлеей, которые есть в системе")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping
    public ResponseEntity<List<BookDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findAll());
    }

    @PostMapping
    public ResponseEntity<BookDto> createBook(@Valid @RequestBody BookDto dto){
        BookDto createdBookDto = bookService.createBook(dto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdBookDto.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdBookDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable long id){
        bookService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<BookDto> updateBook(@PathVariable long id, @Valid @RequestBody BookDto bookDto){
        return ResponseEntity.ok().body(bookService.updateBook(id, bookDto));
    }
}
