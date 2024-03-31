package ru.gb.springboothwsem6.controllers;

import lombok.Data;

@Data
public class IssueRequest { // ожидаемый постзапрос data transfer object
    private long readerId;
    private long bookId;

    public IssueRequest() {
    }

}
