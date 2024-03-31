package ru.gb.myshopbookv2.mapper;

import org.springframework.stereotype.Component;
import ru.gb.myshopbookv2.dto.IssueDto;
import ru.gb.myshopbookv2.model.Book;
import ru.gb.myshopbookv2.model.Issue;
import ru.gb.myshopbookv2.model.Reader;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class IssueMapper {

    public Issue toEntity(IssueDto issueDto){

        Issue issue = new Issue();
        Reader reader = new Reader();
        Book book = new Book();

        reader.setId(issueDto.getReader().getId());
        book.setId(issueDto.getBook().getId());

        issue.setReader(reader);
        issue.setBook(book);

        issue.setIssuedAt(LocalDateTime.now());

        return  issue;
    }

    public IssueDto toDto(Issue issue){
        IssueDto issueDto = new IssueDto();

        issueDto.setBook(issue.getBook());
        issueDto.setReader(issue.getReader());
        issueDto.setId(issue.getId());
        issueDto.setIssuedAt(issue.getIssuedAt());
        issueDto.setReturnedAt(issue.getReturnedAt());

        return issueDto;
    }

    public List<IssueDto> listEntityToListDto(List<Issue> list){
        return list.stream().map(this::toDto).toList();
    }

    public List<Issue> listDtoToListEntity(List<IssueDto> list){
        return list.stream().map(this::toEntity).toList();
    }
}
