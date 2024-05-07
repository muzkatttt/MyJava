package ru.gb.diplom_muzkat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.diplom_muzkat.entity.Receipt;
import ru.gb.diplom_muzkat.entity.ReceiptSumm;
import ru.gb.diplom_muzkat.service.ListReceiptsService;

import java.util.NoSuchElementException;
import java.util.Queue;

@RestController
@RequestMapping("list")
@RequiredArgsConstructor
public class ListReceiptsController {

    private final ListReceiptsService listReceiptsService;

    // localhost:8080/list/sum
    @GetMapping("sum")
    public ResponseEntity<Queue<ReceiptSumm>> findAllReceipts(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(listReceiptsService.getAllSumm());
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // localhost:8080/list/all
    @GetMapping("all")
    public ResponseEntity<Queue<Receipt>> booksResponseEntity() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(listReceiptsService.getAllReceipts());
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
