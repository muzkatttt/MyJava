package ru.gb.myshopbook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.gb.myshopbook.model.Reader;
import ru.gb.myshopbook.service.ReaderService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("reader")
@RequiredArgsConstructor
public class ReaderController {
    private final ReaderService readerService;

    @GetMapping("{id}")
    public ResponseEntity<Reader> findById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(readerService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Reader>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(readerService.findAll());
    }

    @PostMapping
    public ResponseEntity<Reader> createReader(@RequestBody Reader reader){
        Reader createdReader = readerService.createReader(reader);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdReader.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdReader);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteReader(@PathVariable long id){
        readerService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Reader> updateReader(@PathVariable long id, @RequestBody Reader reader){
        return ResponseEntity.ok().body(readerService.updateReader(id, reader));
    }
}