package ru.gb.diplom_muzkat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.diplom_muzkat.entity.Receipt;
import ru.gb.diplom_muzkat.service.ReceiptService;

import java.util.Date;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("receipt")
@RequiredArgsConstructor
public class ReceiptController {
    
    private final ReceiptService receiptService;

    @GetMapping("date")
    public String getByDateStart(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {
        return "Дата и время начала работы по маршруту: " + date;
    }

    @GetMapping("{id}")
    public ResponseEntity<Receipt> findReceiptById(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(receiptService.findById(id));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("{id}/calculate")
    public ResponseEntity<String> calculateSumFromReceipt(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(String.valueOf(calculateSumFromReceipt(id)));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
