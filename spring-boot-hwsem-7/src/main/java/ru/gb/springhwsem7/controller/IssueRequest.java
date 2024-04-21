package ru.gb.springhwsem7.controller;

import lombok.Data;

@Data
public class IssueRequest {
    private long readerId;
    private long bookId;

}
