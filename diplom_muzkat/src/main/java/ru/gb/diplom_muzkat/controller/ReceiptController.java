package ru.gb.diplom_muzkat.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("receipt")
public class ReceiptController {

    @GetMapping("date")
    public String getByDateStart(@RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss") Date date) {
        return "Дата и время начала работы по маршруту: " + date;
    }

    @GetMapping("{id}")

    public String getReceiptById(Long id){
        return "Найден маршрут по {id}" + id;
    }
//    @GetMapping("/stringDate")
//    public String fetchByStringDate(@RequestParam String dateString) {
//        Date date = Date.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        return "Строка успешно преобразована в дату: " + date;
//    }
}
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("reader")
//public class ReaderController {
//    private final ReaderService service;
//
//    @GetMapping("{id}")
//    public ResponseEntity<Reader> findById(@PathVariable Long id) {
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @GetMapping("{id}/issue")
//    public ResponseEntity<List<Issue>> findIssue(@PathVariable Long id) {
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(service.findIssue(id));
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @GetMapping()
//    public ResponseEntity<List<Reader>> booksResponseEntity() {
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }
//@DeleteMapping("{id}")
//    public ResponseEntity<Reader> delete(@PathVariable Long id) {
//        service.deleteById(id);
//        try {
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.findById(id));
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<Reader> createNewReader(@RequestBody String name) {
//        service.addNewReader(name);
//        try {
//           return ResponseEntity.status(HttpStatus.CREATED).body(service.findByName(name));
//
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }