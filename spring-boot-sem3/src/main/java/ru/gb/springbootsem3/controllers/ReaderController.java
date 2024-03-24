package ru.gb.springbootsem3.controllers;


import ru.gb.springbootsem3.entity.Issue;
import ru.gb.springbootsem3.entity.Reader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.springbootsem3.services.ReaderService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("reader")
public class ReaderController {

    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }
    //1.2 Реализовать контроллер по управлению читателями
    private final ReaderService readerService;


    // GET /reader- получить информацию о всех читателях
    @GetMapping
    public ResponseEntity<Reader> getAllReaders() {
        return new ResponseEntity<Reader>((Reader) readerService.getAllReaders(), HttpStatus.OK);
    }

    // GET /reader/{id} - получить информацию о читателе
    @GetMapping("{id}")
    public ResponseEntity<Reader> findById(@PathVariable long id) {
        Reader reader;
        try {
            reader = readerService.findReaderById(id);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Reader>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Reader>(reader, HttpStatus.OK);
    }


    // GET /reader/{id}/issue - вернуть список всех выдачей для данного читателя
    @GetMapping("{id}/issue")
    public ResponseEntity<List<Issue>> showAllIssue(@PathVariable long id){
        return new ResponseEntity<List<Issue>>(readerService.getIssueByReaderId(id), HttpStatus.OK);
    }


    //    POST /reader - создать нового читателя
    @PostMapping()
    public ResponseEntity<Reader> addNewReader(@RequestBody Reader reader){
        return new ResponseEntity<Reader>(readerService.addReader(reader), HttpStatus.CREATED);
    }

    //    DELETE /reader/{id} - удалить читателя
    @DeleteMapping("{id}")
    public ResponseEntity<Reader> deleteReader(@PathVariable long id) {
        readerService.deleteReader(id);
        return new ResponseEntity<Reader>(HttpStatus.OK);
    }

}
