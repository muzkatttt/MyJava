package ru.gb.springbootsem3.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.springbootsem3.entity.Book;
import ru.gb.springbootsem3.entity.Reader;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("ui")
public class ReaderSem4Controller {
    //* 1.2 /ui/reader - на странице должен отобразиться список всех зарегистрированных читателей в системе
    @GetMapping("readers")
    public String readers(Model model) {
        List<Reader> readerList = new ArrayList<>();
        readerList.add(new Reader("Den"));
        readerList.add(new Reader("Chon"));
        readerList.add(new Reader("Pak"));
        model.addAttribute("readers", readerList);
        return "readers";
    }
}
