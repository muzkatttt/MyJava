package ru.gb.springbootlesson5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.springbootlesson5.model.User;
import ru.gb.springbootlesson5.services.JpaUserService;
import ru.gb.springbootlesson5.services.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyController {
    private final UserService service;
    private final JpaUserService jpaUserService;

    @GetMapping("users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @GetMapping("user")
    public User findByName(@RequestParam String name){
        return jpaUserService.getByName(name);
    }

    @GetMapping("update")
    public void update(@RequestParam long id, @RequestParam String newName, @RequestParam int newAge){
        service.updateUser(id, newName, newAge);
    }
}
