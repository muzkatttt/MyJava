package ru.gb.springhwsem7.service;

import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;
import java.util.TreeMap;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import ru.gb.springhwsem7.controller.IssueRequest;
import ru.gb.springhwsem7.model.Issue;
import org.springframework.stereotype.Service;
import ru.gb.springhwsem7.repository.BookRepository;
import ru.gb.springhwsem7.repository.IssueRepository;
import ru.gb.springhwsem7.repository.ReaderRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class IssueService {
    @Value("${application.issue.max-allowed-books:1}")
    private int maxBook;
    private final BookRepository bookRepository;
    private final IssueRepository issueRepository;
    private final ReaderRepository readerRepository;

    public Issue createIssue(IssueRequest request) {
        if (bookRepository.findById(request.getBookId()) == null) {
            log.info("Не удалось найти книгу с id " + request.getBookId());
            throw new NoSuchElementException("Не удалось найти книгу с id " + request.getBookId());
        }
        if (readerRepository.findById(request.getReaderId()) == null) {
            log.info("Не удалось найти читателя с id " + request.getReaderId());
            throw new NoSuchElementException("Не удалось найти читателя с id " + request.getReaderId());
        }

        if (issueRepository.findCountBooksByIdReader(request.getReaderId()) >= maxBook) {
            log.info("У читателя с id " + request.getReaderId() + " максимальное количество книг на руках.");
            return new Issue(-1L, -1L);
        }

        Issue issue = new Issue(request.getReaderId(), request.getBookId());
        issueRepository.save(issue);
        return issue;
    }

    public TreeMap<String, String> findById(Long id) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        TreeMap<String, String> map = new TreeMap<>();
        Issue issue = issueRepository.findById(id).orElse(null);
        Long idReader = issue.getIdReader();
        Long idBook = issue.getIdBook();
        String nameReader = readerRepository.findById(idReader).orElse(null).getName();
        String nameBook = bookRepository.findById(idBook).orElse(null).getName();
        String issuedAt = issue.getIssuedAt().format(formatter);
        String returnedAt = "-";
        if (issue.getReturnBookTime() != null) {
            returnedAt = issue.getReturnBookTime().format(formatter);
        }
        map.put("Reader", nameReader);
        map.put("Book", nameBook);
        map.put("issued_at", issuedAt);
        map.put("returned_at", returnedAt);
        return map;
    }

    public void setReturnedAt(Long id) {
        issueRepository.setReturnedAt(id);
    }
}
