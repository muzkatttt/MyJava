package ru.gb.myshopbookv2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.myshopbookv2.dto.BookDto;
import ru.gb.myshopbookv2.mapper.BookMapper;
import ru.gb.myshopbookv2.model.Book;
import ru.gb.myshopbookv2.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    public static final String NOT_FOUND_MESSAGE = "Не удалось найти книгу с id=";

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookDto findById(long id){
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            throwNotFoundExceptionById(id);
        }
        return bookMapper.toDto(book);
    }

    public void deleteById(long id){
        checkExistsById(id);
        bookRepository.deleteById(id);
    }

    public BookDto createBook(BookDto bookDto){
        Book book = bookMapper.toEntity(bookDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    public BookDto updateBook(long id, BookDto bookDto) {
        checkExistsById(id);
        bookDto.setId(id);
        Book book = bookMapper.toEntity(bookDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    public List<BookDto> findAll() {
        return bookMapper.listEntityToListDto(bookRepository.findAll());
    }

    private void checkExistsById(long id){
        if (!bookRepository.existsById(id)){
            throwNotFoundExceptionById(id);
        }
    }

    private void throwNotFoundExceptionById(long id){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, NOT_FOUND_MESSAGE + id);
    }
}
