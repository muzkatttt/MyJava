package ru.gb;

import jakarta.servlet.Filter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final List<Filter> filter;

    @GetMapping("book/{id}")
    public String getById(@PathVariable long id){
        for (Filter filter1: filter){
            System.out.println(filter1.getClass().getName());
        }
        return "Нашли книгу с id=" + id;
    }
}
