package ru.gb.springhwsem7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.springhwsem7.model.Reader;
import ru.gb.springhwsem7.service.ReaderService;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("ui")
public class ReaderSem4Controller {
    //* 1.2 /ui/reader - на странице должен отобразиться список всех читателей в системе
    @GetMapping("readers")
    public String readers(Model model) {
        List<Reader> readerList = new ArrayList<>();
        readerList.add(new Reader("Den"));
        readerList.add(new Reader("Chon"));
        readerList.add(new Reader("Pak"));
        model.addAttribute("readers", readerList);
        return "readers";
    }

    @GetMapping("readers/all")
    public String allReaders(Model model, @RequestParam ReaderService readerService){
        model.addAttribute("readers", readerService.getAllReaders());
        return "readers";
    }
}


