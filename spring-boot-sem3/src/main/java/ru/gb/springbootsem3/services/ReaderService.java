package services;

import entity.Issue;
import entity.Reader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.IssueRepository;
import repository.ReaderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ReaderService {
    private final ReaderRepository readerRepository;
    private IssueRepository issueRepository;

    public List<Reader> getAllReaders() {
        return readerRepository.getAllReaders();
    }

    public Reader findReaderById(long id) {
        Reader reader = readerRepository.findById(id);
        if (reader == null) {
            throw new NoSuchElementException("Читатель с {id} не найден");
        }
        return reader;
    }

    public Reader addReader(Reader reader) {
        return readerRepository.addReader(reader);
    }

    public void deleteReader(long id) {
        readerRepository.deleteReader(id);
    }

    // 2.2 В сервис читателя добавить ручку
    // GET /reader/{id}/issue - вернуть список всех выдачей для данного читателя
    public List<Issue> getIssueByReaderId(long id) {
        List<Issue> listIssueByReader = new ArrayList<>();
        for (Issue issue : issueRepository.getAllIssues()) {
            if (issue.getIdReader() == id) {
                listIssueByReader.add(issue);
            }
        }
        return listIssueByReader;

    }

}
