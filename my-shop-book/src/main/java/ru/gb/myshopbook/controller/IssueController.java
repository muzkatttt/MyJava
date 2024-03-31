package ru.gb.myshopbook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.gb.myshopbook.model.Issue;
import ru.gb.myshopbook.service.IssueService;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("issue")
public class IssueController {
    private final IssueService issueService;

    @GetMapping("{id}")
    public ResponseEntity<Issue> findById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(issueService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Issue>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(issueService.findAll());
    }

    @PostMapping
    public ResponseEntity<Issue> createIssue(@RequestBody Issue issue){
        Issue createdIssue = issueService.saveIssue(issue);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdIssue.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdIssue);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteIssue(@PathVariable long id){
        issueService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Issue> returnBook(@PathVariable long id){
        return ResponseEntity.ok().body(issueService.returnBook(id));
    }
}
