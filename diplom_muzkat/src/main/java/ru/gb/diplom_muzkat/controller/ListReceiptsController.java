package ru.gb.diplom_muzkat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("listReceipts")
public class ListReceiptsController {
    @GetMapping("all")
    public String getAllReceipts(){
        return "список всех маршрутов\n";
    }



}
