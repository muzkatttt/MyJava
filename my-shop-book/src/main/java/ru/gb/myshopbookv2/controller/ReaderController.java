package ru.gb.myshopbookv2.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.gb.myshopbookv2.dto.ReaderDto;
import ru.gb.myshopbookv2.service.ReaderService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("reader")
@RequiredArgsConstructor
public class ReaderController {
    private final ReaderService readerService;

    @GetMapping("{id}")
    public ResponseEntity<ReaderDto> findById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(readerService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ReaderDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(readerService.findAll());
    }

    @PostMapping
    public ResponseEntity<ReaderDto> createReader(@Valid @RequestBody ReaderDto readerDto){
        ReaderDto createdReaderDto = readerService.createReader(readerDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdReaderDto.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdReaderDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteReader(@PathVariable long id){
        readerService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<ReaderDto> updateReader(@PathVariable long id, @Valid @RequestBody ReaderDto readerDto){
        return ResponseEntity.ok().body(readerService.updateReader(id, readerDto));
    }
}