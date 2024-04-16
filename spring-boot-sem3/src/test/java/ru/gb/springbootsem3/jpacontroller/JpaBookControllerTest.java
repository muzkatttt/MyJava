package ru.gb.springbootsem3.jpacontroller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import ru.gb.springbootsem3.jpaentity.TestBookJpa;
import ru.gb.springbootsem3.jparepository.JpaBookRepository;
import ru.gb.springbootsem3.jpaentity.BookJpa;
import java.util.List;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@SpringBootTest
class JpaBookControllerTest {


    @Autowired
    JpaBookRepository bookRepository;
    @Autowired
    WebTestClient webTestClient;


    @Test
    void testGetAllBooks() {
        JpaBookRepository bookRepository = mock(JpaBookRepository.class);
        bookRepository.saveAll(List.of(
                new BookJpa("book 1"),
                new BookJpa("book 2")
        ));

        List<BookJpa> testResult = bookRepository.findAll();

        List<TestBookJpa> responseBody = webTestClient.get()
                .uri("book")
                .exchange()
                .expectStatus().isOk()
                .expectBody(new ParameterizedTypeReference<List<TestBookJpa>>(){
                })
                .returnResult()
                .getResponseBody();

        assert responseBody != null;
        assertEquals(testResult.size(), responseBody.size());
        Assertions.assertNotNull(responseBody);
        for (TestBookJpa testBookJpa : responseBody){
            boolean found = testResult.stream()
                    .filter(book -> Objects.equals(testBookJpa.getId(), book.getId()))
                    .anyMatch(book -> Objects.equals(testBookJpa.getName(), book.getName()));
            assertTrue(found);
        }
    }

    @Test
    void findBookByName() {

    }

    @Test
    void findBookById() {
        BookJpa resultTest = bookRepository.save(new BookJpa("Book1"));

        TestBookJpa responseBody = webTestClient.get()
                .uri("Book1")
                .exchange()
                .expectStatus().isOk()
                .expectBody(TestBookJpa.class)
                .returnResult()
                .getResponseBody();
        assertNotNull(responseBody);
        assertEquals(resultTest.getId(), responseBody.getId());
        assertEquals(resultTest.getName(), responseBody.getName());
    }

    @Test
    public void testFindBookById() throws Exception {

        BookJpa savedBook = bookRepository.save(new BookJpa("book"));

        BookJpa responseBody = webTestClient.get()
                .uri("book/" + savedBook.getId())
                .exchange()
                .expectStatus().isOk()
                .expectBody(BookJpa.class)
                .returnResult()
                .getResponseBody();

        Assertions.assertNotNull(responseBody);
        Assertions.assertEquals(responseBody.getId(), savedBook.getId());
        Assertions.assertEquals(responseBody.getName(), savedBook.getName());
    }


    @Test
    void testDeleteBookById() throws Exception {

    }
    
}
