package ru.gb.springbootlesson4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class MyRestController {
    @Value("${application.max-count-book:1}")
    private int value;

    @GetMapping("test/{id}")
    public ResponseEntity<Person> test(@PathVariable int id){
        if (id < 10){
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Person("Иван", "Кириллович", 15)
            );
        }

//        throw new NoSuchElementException("не удалось найти запись");
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Не удалось найти запись");
    }

//    @ExceptionHandler({NoSuchElementException.class, ClassCastException.class})
//    public ResponseEntity<String> myExceptionHandler(){
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Не удалось найти запись");
//    }
}
