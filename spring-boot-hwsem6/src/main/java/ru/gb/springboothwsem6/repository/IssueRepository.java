package ru.gb.springboothwsem6.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ru.gb.springboothwsem6.entity.Issue;
import org.springframework.stereotype.Repository;


@Repository

public class IssueRepository {

    public IssueRepository() {
    }

    private List<Issue> list = new ArrayList();

    public void createIssue(Issue issue) {
        this.list.add(issue);
    }

    public Issue findById(long id) {
        return (Issue) this.list.stream().filter((e) -> {
            return e.getId() == id;
        }).findFirst().orElse((Issue) null);
    }


    public int countBooksByReader(long readerId) {
        int count = 0;
        for (Issue issue : list) {
            if (issue.getIdReader() == readerId) {
                count++;
            }
        }
        return count;
    }

//    public Boolean returnBook(long issueId) {
//        for (Issue issue : list) {
//            if (issue.getId() == issueId) {
//                return issue.returnBook();
//            }
//        }
//        return false;
//    }

    public List<Issue> getAllIssues() {
        return list;
    }

    public Issue getIssueByDateTook(String date) {
        return (Issue) this.list.stream().filter((e) -> {
            return Objects.equals(e.getDateOfTook(), date);
        }).findFirst().orElse((Issue) null);
    }

    public Issue getIssueByDateReturn(String date) {
        return (Issue) this.list.stream().filter((e) -> {
            return Objects.equals(e.getDateOfTook(), date);
        }).findFirst().orElse((Issue) null);
    }
}




