package ru.gb.springbootlesson10.hwsem10;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.springbootlesson10.hwsem10.Book;
import ru.gb.springbootlesson10.hwsem10.BookDto;
import ru.gb.springbootlesson10.hwsem10.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<BookDto> getAllBooks(){
        return repository.findAll().stream()
                .map(this::mapToDto)
                .toList();
    }

    public Optional<BookDto> getById(long id){
        return repository.findById(id)
                .map(this::mapToDto);
    }

    private BookDto mapToDto(Book book){
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        return bookDto;
    }
}
