package ru.gb.springhwsem7.controller;


import lombok.RequiredArgsConstructor;
import ru.gb.springhwsem7.model.Issue;
import ru.gb.springhwsem7.model.Reader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.springhwsem7.service.ReaderService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("reader")
@RequiredArgsConstructor
public class ReaderController {
    private final ReaderService service;

    @GetMapping("{id}")
    public ResponseEntity<Reader> findById(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("{id}/issue")
    public ResponseEntity<List<Issue>> findIssue(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findIssue(id));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping()
    public ResponseEntity<List<Reader>> booksResponseEntity() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Reader> deleteReader(@PathVariable Long id) {
        service.deleteById(id);
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.findById(id));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Reader> createReader(@RequestBody String name) {
        service.addNewReader(name);
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.findByName(name));

        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
