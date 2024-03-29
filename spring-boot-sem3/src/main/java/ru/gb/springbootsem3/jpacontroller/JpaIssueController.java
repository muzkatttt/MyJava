package ru.gb.springbootsem3.jpacontroller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaIssueController {
    private final JpaIssueController controller;


    public JpaIssueController(JpaIssueController controller) {
        this.controller = controller;
    }


}
