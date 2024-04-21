package ru.gb.springhwsem7.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springhwsem7.model.Issue;


public interface IssueRepository extends JpaRepository<Issue, Long> {

    default int findCountBooksByIdReader(Long idReader){
        int count = 0;
        for (Issue issue:findAll()){
            if (issue.getIdReader().equals(idReader) && issue.getReturnBookTime() == null){
                count++;
            }
        }
        return count;
    }
    default List<Issue> findIssueAllByIdReader(Long idReader){
        List<Issue> temp = new ArrayList<>();
        for (Issue issue:findAll()){
            if (issue.getIdReader().equals(idReader)){
                temp.add(issue);
            }
        }
        return temp;
    }

    default void setReturnedAt(Long id){
        for (Issue issue:findAll()){
            if (issue.getId().equals(id) && issue.getReturnBookTime() == null){
                issue.setReturnBookTime(LocalDateTime.now());
                save(issue);
            }
        }
    }
}



