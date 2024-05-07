package ru.gb.diplom_muzkat.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;

@RestController
public class DateController {
    //Преобразование параметров даты на уровне запроса

    @PostMapping("date")
    public void date(@RequestParam("date")
                     @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {


    }

}
