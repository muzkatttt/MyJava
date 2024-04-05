package ru.gb.springhwsem7.controller;

import lombok.Data;

@Data
public class IssueRequest { // ожидаемый постзапрос data transfer object
    private long readerId;
    private long bookId;

    public IssueRequest() {
    }

}
