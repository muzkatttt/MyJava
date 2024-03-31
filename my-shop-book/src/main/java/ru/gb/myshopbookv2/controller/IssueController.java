package ru.gb.myshopbookv2.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.gb.myshopbookv2.dto.IssueDto;
import ru.gb.myshopbookv2.service.IssueService;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("issue")
public class IssueController {
    private final IssueService issueService;

    @GetMapping("{id}")
    public ResponseEntity<IssueDto> findById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(issueService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<IssueDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(issueService.findAll());
    }

    @PostMapping
    public ResponseEntity<IssueDto> createIssue(@Valid @RequestBody IssueDto issueDto){
        IssueDto createdIssueDto = issueService.saveIssue(issueDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdIssueDto.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdIssueDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteIssue(@PathVariable long id){
        issueService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<IssueDto> returnBook(@PathVariable long id){
        return ResponseEntity.ok().body(issueService.returnBook(id));
    }
}
