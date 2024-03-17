package controllers;

import java.util.NoSuchElementException;

import entity.Issue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.IssueService;


@RestController
@RequestMapping({"issue"})
public class IssueController {
    private static final Logger log = LoggerFactory.getLogger(IssueController.class);
    @Autowired
    private IssueService service;

    @PostMapping
    public ResponseEntity<Issue> issueBook(@RequestBody IssueRequest issueRequest) {
        log.info("Поступил запрос на выдачу: readerId={}, bookId={}", issueRequest.getReaderId(), issueRequest.getBookId());

        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.service.createIssue(issueRequest));
        } catch (NoSuchElementException var3) {
            return ResponseEntity.notFound().build();
        }
    }

    public IssueController() {
    }
}
