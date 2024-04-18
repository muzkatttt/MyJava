package ru.gb.springbootlesson10.app.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;
import ru.gb.springbootlesson10.hwsem10.Book;
import ru.gb.springbootlesson10.hwsem10.BookDto;
import ru.gb.springbootlesson10.hwsem10.BookRepository;


import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;



class BookControllerTest extends JUnitSpringBootBase{

    @Autowired
    WebTestClient webTestClient;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void getAllBooks() {
        bookRepository.saveAll(List.of(
                new Book("Book 1"),
                new Book("Book 2")
        ));

        List<Book> books = bookRepository.findAll();

        List<BookDto> responseBody = webTestClient.get()
                .uri("book")
                .exchange()
                .expectStatus().isOk()
                .expectBody(new ParameterizedTypeReference<List<BookDto>>() {
                })
                .returnResult()
                .getResponseBody();

        Assertions.assertEquals(books.size(), responseBody.size());
        for (BookDto bookDto : responseBody) {
            boolean found = books.stream()
                    .filter(it -> Objects.equals(bookDto.getId(), it.getId()))
                    .anyMatch(it -> Objects.equals(bookDto.getName(), it.getName()));
            Assertions.assertTrue(found);
        }
    }

    @Test
    void getById() {
        Book testBook = bookRepository.save(new Book("book"));

        BookDto responseBody = webTestClient.get()
                .uri("book/" + testBook.getId())
                .exchange()
                .expectStatus().isOk()
                .expectBody(BookDto.class)
                .returnResult()
                .getResponseBody();
        assertNotNull(responseBody);
        assertEquals(responseBody.getId(), testBook.getId());
        assertEquals(responseBody.getName(), testBook.getName());
    }
}

//    @Test
//    void testGetByIdNotFound() {
////        long size = customerRepository.findAll().size();
////        long unexpectedId = size + 1;
//        Long maxId = jdbcTemplate.queryForObject("select max(id) from customers", Long.class);
//        long unexpectedId;
//        if (maxId == null){
//            unexpectedId = 1;
//        } else {
//            unexpectedId = maxId + 1;
//        }
//
//        webTestClient.get()
//                .uri("customer/" + unexpectedId)
//                .exchange()
//                .expectStatus().isNotFound();
//    }
//