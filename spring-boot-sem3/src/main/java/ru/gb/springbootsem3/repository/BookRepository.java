package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    private List<Book> list = new ArrayList();

    public BookRepository() {
        this.list.add(new Book("Война и мир"));
        this.list.add(new Book("Мастер и Маргарита"));
        this.list.add(new Book("Приключения Буратино"));
    }

    public Book findById(long id) {
        return (Book)this.list.stream().filter((e) -> {
            return e.getId() == id;
        }).findFirst().orElse((Book) null);
    }
}
