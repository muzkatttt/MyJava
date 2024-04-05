package ru.gb.springhwsem7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.springhwsem7.service.UserMyUserService;

@RestController
@RequiredArgsConstructor
public class UserMyUserController {

    private final UserMyUserService service;

    @GetMapping("any")
    public String any(){
        return "any";
    }

    @GetMapping("admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("user")
    public String user(){
        return "user";
    }

    @GetMapping("auth")
    public String auth(){
        return "auth";
    }
}
