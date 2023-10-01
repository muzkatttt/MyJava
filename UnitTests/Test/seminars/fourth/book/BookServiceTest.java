package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {


    /**
     * Задание 2.
     * У вас есть класс BookService, который использует интерфейс BookRepository
     * для получения информации о книгах из базы данных.
     * Ваша задача написать unit-тесты для BookService,
     * используя Mockito для создания мок-объекта BookRepository.
     */
    @Test

    public void bookServiceTest() {
        Book book = new Book("1", "Winter", "Kate");
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        when(bookRepositoryMock.findById("1")).thenReturn(new Book("2", "Book1", "Author1"));

        BookService bookService = new BookService(bookRepositoryMock);

        assertThat(bookService.findBookById("2")).isEqualTo(book.getId());

    }
}