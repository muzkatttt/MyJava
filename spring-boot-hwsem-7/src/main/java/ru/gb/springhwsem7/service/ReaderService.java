package ru.gb.springhwsem7.service;

import ru.gb.springhwsem7.model.Issue;
import ru.gb.springhwsem7.model.Reader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.springhwsem7.repository.IssueRepository;
import ru.gb.springhwsem7.repository.ReaderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ReaderService {
    private final ReaderRepository readerRepository;
    private final IssueRepository issueRepository;

    public List<Reader> getAll() {
        return readerRepository.findAll();
    }

    public Reader findById(Long id){
        return readerRepository.findById(id).orElse(null);
    }
    public void addNewReader(String name){
        readerRepository.save(new Reader(name));
    }
    public void deleteById(Long id){
        readerRepository.deleteById(id);
    }
    public Reader findByName(String name){
        return readerRepository.findByName(name);
    }
    public List<Issue> findIssue(Long id) {
        return issueRepository.findIssueAllByIdReader(id);
    }

}
