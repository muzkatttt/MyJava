package ru.gb.springbootlesson7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/public")
    public String publicPage(){
        return "publicPage";
    }

    @GetMapping("/private")
    private String privatePage(){
        return "privatePage";
    }

    @GetMapping("/login")
    private String login(){
        return "login";
    }
}
