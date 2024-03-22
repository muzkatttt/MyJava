package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Issue;
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
        return (Issue)this.list.stream().filter((e) -> {
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

    public Boolean returnBook(long issueId) {
        for (Issue issue : list) {
            if (issue.getId() == issueId) {
                return issue.returnBook();
            }
        }
        return false;
    }

    public List<Issue> getAllIssues(){
        return list;
    }

}



