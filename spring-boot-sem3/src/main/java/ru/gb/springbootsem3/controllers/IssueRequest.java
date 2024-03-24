package ru.gb.springbootsem3.controllers;

import lombok.Data;

@Data
public class IssueRequest { // ожидаемый постзапрос data transfer object
    private long readerId;
    private long bookId;

    public IssueRequest() {
    }

}
