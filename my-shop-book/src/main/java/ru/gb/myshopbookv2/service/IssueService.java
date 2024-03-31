package ru.gb.myshopbookv2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.myshopbookv2.config.IssueProperties;
import ru.gb.myshopbookv2.dto.IssueDto;
import ru.gb.myshopbookv2.mapper.IssueMapper;
import ru.gb.myshopbookv2.model.Issue;
import ru.gb.myshopbookv2.repository.BookRepository;
import ru.gb.myshopbookv2.repository.IssueRepository;
import ru.gb.myshopbookv2.repository.ReaderRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {
    public static final String NOT_FOUND_MESSAGE = "Не удалось найти запись о выдаче с id=";

    private final IssueRepository issueRepository;
    private final BookRepository bookRepository;
    private final ReaderRepository readerRepository;
    private final IssueMapper issueMapper;
    private final IssueProperties properties;

    public IssueDto findById(long id) {
        Issue issue = issueRepository.findById(id).orElse(null);
        if (issue == null) {
            throwNotFoundExceptionById(id);
        }
        return issueMapper.toDto(issue);
    }

    public void deleteById(long id) {
        checkExistsById(id);
        issueRepository.deleteById(id);
    }

    public IssueDto saveIssue(IssueDto issueDto) {
        Issue issue = issueMapper.toEntity(issueDto);

        checkBookExists(issue);
        checkReaderExists(issue);
        checkReadersCountBook(issue);

        Issue savedIssue = issueRepository.save(issue);
        fillIssue(savedIssue);

        return issueMapper.toDto(savedIssue);
    }

    public IssueDto returnBook(long id) {
        Issue issue = issueRepository.findById(id).orElse(null);
        if (issue == null) {
            throwNotFoundExceptionById(id);
        }

        if (issue.getReturnedAt() == null) {
            issue.setReturnedAt(LocalDateTime.now());
            return issueMapper.toDto(issueRepository.save(issue));
        }
        return issueMapper.toDto(issue);
    }

    public List<IssueDto> findAll() {
        return issueMapper.listEntityToListDto(issueRepository.findAll());
    }

    private void fillIssue(Issue issue) {
        issue.setBook(bookRepository.findById(issue.getBook().getId()).orElse(null));
        issue.setReader(readerRepository.findById(issue.getReader().getId()).orElse(null));
    }

//    private Issue createIssueAndSave(Issue issue) {
//        issue.setId(null);
//        issue.setIssuedAt(LocalDateTime.now());
//        issue.setReturnedAt(null);
//
//        return issueRepository.save(issue);
//    }

    private void checkExistsById(long id) {
        if (!issueRepository.existsById(id)) {
            throwNotFoundExceptionById(id);
        }
    }

    private void checkReadersCountBook(Issue issue) {
        long countBooksOnHand = issueRepository.countByReaderAndReturnedAtIsNull(issue.getReader());
        if (countBooksOnHand > properties.getMaxAllowedBooks()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "У вас уже максимально допустимое количество книг на руках. Сдайте книги прежде, чем получите новые");
        }
    }

    private void checkReaderExists(Issue issue) {
        if (issue.getReader() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "не указано значение для поля reader");
        }
        if (!readerRepository.existsById(issue.getReader().getId())) {
            throwNotFoundExceptionById(issue.getReader().getId(), ReaderService.NOT_FOUND_MESSAGE);
        }
    }

    private void checkBookExists(Issue issue) {
        if (issue.getBook() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "не указано значение для поля book");
        }
        if (!bookRepository.existsById(issue.getBook().getId())) {
            throwNotFoundExceptionById(issue.getBook().getId(), BookService.NOT_FOUND_MESSAGE);
        }
    }

    private void throwNotFoundExceptionById(long id) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, NOT_FOUND_MESSAGE + id);
    }

    private void throwNotFoundExceptionById(long id, String message) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, message + id);
    }
}
