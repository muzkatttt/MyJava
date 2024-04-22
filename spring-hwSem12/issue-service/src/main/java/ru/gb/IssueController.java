package ru.gb;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class IssueController {
    private List<Issue> issues;
    private final BookProvider bookProvider;

    @PostConstruct
    public void generateIssue(){
        issues = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Issue issue = new Issue();
            issue.setId(UUID.randomUUID());
            issue.setIdReader(UUID.randomUUID());
            issue.setIdBook(bookProvider.getRandomBookId());
            issues.add(issue);
        }
    }
    @GetMapping("all")
    public List<Issue> getAllIssues(){
        return issues;
    }

    @GetMapping("refresh")
    public List<Issue> refresh(){
        generateIssue();
        return issues;
    }
}
