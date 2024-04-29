package ru.gb.diplom_muzkat.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.diplom_muzkat.entity.Receipt;

import java.util.Date;

@RestController
public class DateController {
    //Преобразование параметров даты на уровне запроса

    private Receipt receipt;
    @PostMapping("date")
    public void date(@RequestParam("date")
                     @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss") Date date) {


    }

}
