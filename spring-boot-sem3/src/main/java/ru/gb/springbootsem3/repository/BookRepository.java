package ru.gb.springbootsem3.repository;

import java.util.ArrayList;
import java.util.List;

import ru.gb.springbootsem3.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public BookRepository() {
        this.list.add(new Book("Vremya"));
        this.list.add(new Book("W&P"));
        this.list.add(new Book("L3"));
    }

    private final List<Book> list = new ArrayList<>();
    public Book findById(long id) {
        return this.list.stream().filter((e) -> {
            return e.getId() == id;
        }).findFirst().orElse((Book) null);
    }

    public List<Book> addBook(Book book){
        list.add(book);
        return list;
    }

    public void deleteBook(long id){
        list.removeIf(book -> book.getId() == id);
    }

    public List<Book> getAllBooks() {
        return List.copyOf(list);
    }
}
