package services;

import entity.Book;
import org.springframework.stereotype.Service;
import repository.BookRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
//@RequiredArgsConstructor
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }


    public Book getById(long id) {
        Book book = bookRepository.findById(id);
        if (book == null) {
            throw new NoSuchElementException("Не найдена книга с идентификатором {id}");
        }
        return book;
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void deleteBook(long id) {
        bookRepository.deleteBook(id);
    }

}

