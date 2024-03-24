package ru.gb.springbootsem3.controllers;

import java.util.NoSuchElementException;

import ru.gb.springbootsem3.entity.Issue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.springbootsem3.services.IssueService;



@RestController
@RequestMapping({"issue"})
public class IssueController {

    public IssueController() {
    }
    private static final Logger log = LoggerFactory.getLogger(IssueController.class);
    @Autowired
    private IssueService service;

    /*
    GET - получение записей (принято посылать запрос без тела)
    POST - создание записей (в теле передается объект, данные по которому необходимо создать запись)
    PUT - изменение записей (в теле передается объект, по которому необходимо изменить запись
    DELETE - удаление записей (в теле указывается id ресурса, который необходимо удалить
     */

    @PostMapping
    public ResponseEntity<Issue> issueBook(@RequestBody IssueRequest issueRequest) {
        // @RequestBody - есть тело запроса, их необходмо привести в соответствии с IssueRequest
        log.info("Поступил запрос на выдачу: readerId={}, bookId={}", issueRequest.getReaderId(), issueRequest.getBookId());
        // ResponseEntity выдает номер ошибки при некорректной обработке
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.service.createIssue(issueRequest));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build(); // 404
        }
    }


    //добавить ресурс GET /issue/{id} - получить описание факта выдачи
    @GetMapping("{id}")
    public ResponseEntity<Issue> getIssue(@PathVariable long id) {
        Issue issue = service.getById(id);
        if (issue != null) {
            return new ResponseEntity<Issue>(issue, HttpStatus.OK);
        }
        return new ResponseEntity<Issue>(HttpStatus.NOT_FOUND);
    }

}
