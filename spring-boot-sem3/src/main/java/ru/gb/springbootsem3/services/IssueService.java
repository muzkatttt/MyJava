package services;

import java.util.NoSuchElementException;

import controllers.IssueRequest;
import entity.Issue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import repository.BookRepository;
import repository.IssueRepository;
import repository.ReaderRepository;


@Service
public class IssueService {

    public IssueService(final BookRepository bookRepository, final IssueRepository issueRepository, final ReaderRepository readerRepository) {
        this.bookRepository = bookRepository;
        this.issueRepository = issueRepository;
        this.readerRepository = readerRepository;
    }

    private static final Logger log = LoggerFactory.getLogger(IssueService.class);
    private final BookRepository bookRepository;
    private final IssueRepository issueRepository;
    private final ReaderRepository readerRepository;


    //- 2.1 В сервис IssueService добавить проверку, что у пользователя на руках нет книг.
    public Issue createIssue(IssueRequest request) throws IllegalArgumentException {
        if (this.bookRepository.findById(request.getBookId()) == null) {
            log.info("Не удалось найти книгу с id " + request.getBookId());
            throw new NoSuchElementException("Не удалось найти книгу с id " + request.getBookId());
        } else if (this.readerRepository.findById(request.getReaderId()) == null) {
            log.info("Не удалось найти читателя с id " + request.getReaderId());
            throw new NoSuchElementException("Не удалось найти читателя с id " + request.getReaderId());
        // проверка, что у пользователя на руках нет книг
        } else if (issueRepository.countBooksByReader(request.getReaderId()) == 1) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "У читателя с id " +
                    request.getReaderId() + " уже есть книга");
        } else {
            Issue issue = new Issue(request.getReaderId(), request.getBookId());
            this.issueRepository.createIssue(issue);
            return issue;
        }
    }

    public Issue getById(long id) {
        return issueRepository.findById(id);
    }

    public Boolean returnBook(long id) {
        return issueRepository.returnBook(id);
    }

}



