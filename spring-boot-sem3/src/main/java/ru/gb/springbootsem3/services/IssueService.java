package services;

import java.util.NoSuchElementException;

import controllers.IssueRequest;
import entity.Issue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import repository.BookRepository;
import repository.IssueRepository;
import repository.ReaderRepository;


@Service
public class IssueService {
    private static final Logger log = LoggerFactory.getLogger(IssueService.class);
    private final BookRepository bookRepository;
    private final IssueRepository issueRepository;
    private final ReaderRepository readerRepository;

    public Issue createIssue(IssueRequest request) {
        if (this.bookRepository.findById(request.getBookId()) == null) {
            log.info("Не удалось найти книгу с id " + request.getBookId());
            throw new NoSuchElementException("Не удалось найти книгу с id " + request.getBookId());
        } else if (this.readerRepository.findById(request.getReaderId()) == null) {
            log.info("Не удалось найти читателя с id " + request.getReaderId());
            throw new NoSuchElementException("Не удалось найти читателя с id " + request.getReaderId());
        } else {
            Issue issue = new Issue(request.getReaderId(), request.getBookId());
            this.issueRepository.createIssue(issue);
            return issue;
        }
    }

    public IssueService(final BookRepository bookRepository, final IssueRepository issueRepository, final ReaderRepository readerRepository) {
        this.bookRepository = bookRepository;
        this.issueRepository = issueRepository;
        this.readerRepository = readerRepository;
    }
}
