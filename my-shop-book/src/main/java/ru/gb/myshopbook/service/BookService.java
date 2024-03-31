package ru.gb.myshopbook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.myshopbook.model.Book;
import ru.gb.myshopbook.repository.BookRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BookService {
    public static final String NOT_FOUND_MESSAGE = "Не удалось найти книгу с id=";

    private final BookRepository bookRepository;

    public Book findById(long id){
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            throwNotFoundExceptionById(id);
        }
        return book;
    }

    public void deleteById(long id){
        checkExistsById(id);
        bookRepository.deleteById(id);
    }

    public Book createBook(Book book){
        book.setId(null);
        return bookRepository.save(book);
    }

    public Book updateBook(long id, Book book) {
        checkExistsById(id);
        book.setId(id);
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
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
