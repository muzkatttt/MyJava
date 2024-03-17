package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Issue;
import org.springframework.stereotype.Repository;


@Repository
public class IssueRepository {
    private List<Issue> list = new ArrayList();

    public IssueRepository() {
    }

    public void createIssue(Issue issue) {
        this.list.add(issue);
    }

    public Issue findById(long id) {
        return (Issue)this.list.stream().filter((e) -> {
            return e.getId() == id;
        }).findFirst().orElse((Issue) null);
    }
}

