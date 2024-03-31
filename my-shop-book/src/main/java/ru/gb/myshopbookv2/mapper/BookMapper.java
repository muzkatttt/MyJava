package ru.gb.myshopbookv2.mapper;

import org.springframework.stereotype.Component;
import ru.gb.myshopbookv2.dto.BookDto;
import ru.gb.myshopbookv2.model.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookMapper {

    public BookDto toDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setName(book.getName());
        bookDto.setId(book.getId());
        return bookDto;
    }

    public Book toEntity(BookDto bookDto) {
        Book book = new Book();
        book.setName(bookDto.getName());
        return book;
    }

    public List<BookDto> listEntityToListDto(List<Book> list){
        return list.stream().map(this::toDto).toList();
    }

    public List<Book> listDtoToListEntity(List<BookDto> list){
        return list.stream().map(this::toEntity).toList();
    }
}
