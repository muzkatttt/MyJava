package ru.gb.issue_service;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class IssueController {
    private final List<Issue> issues = new ArrayList<>();

    @PostConstruct
    public void generateIssue(){

    }
    @GetMapping("all")
    public List<Issue> getAllIssues(){
        return issues;
    }


}
