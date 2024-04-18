package ru.gb.springbootlesson10.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.springbootlesson10.app.dto.CustomerDto;
import ru.gb.springbootlesson10.app.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<CustomerDto> getAll(){
        return customerService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerDto> getById(@PathVariable long id){
        return customerService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
