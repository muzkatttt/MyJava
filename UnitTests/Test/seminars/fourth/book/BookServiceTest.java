package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class BookServiceTest {


    /**
     * Задание 2.
     * У вас есть класс BookService, который использует интерфейс BookRepository
     * для получения информации о книгах из базы данных.
     * Ваша задача написать unit-тесты для BookService,
     * используя Mockito для создания мок-объекта BookRepository.
     */
    @Test
    public void bookServiceTestEquals() {
        Book book = new Book("1", "Winter", "Kate");

        // создаем instance class --> bookRepositoryMock, который содержит метод findById()
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        // прописываем поведение bookRepositoryMock, от которого ожидаем любое строковое значение ID книги
        // и сравниваем его с экземпляром класса book
        when(bookRepositoryMock.findById(anyString())).thenReturn(book);

        BookService bookService = new BookService(bookRepositoryMock);

        assertEquals(bookService.findBookById("1"), book);
    }
    @Test
    public void bookServiceTest() {
        Book book = new Book("2", "Winter", "Kate");
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        // прописываем поведение bookRepositoryMock, от которого ожидаем
        // строковое значение ID книги и сравниваем его с экземпляром класса book
        when(bookRepositoryMock.findById("1")).thenReturn(book);

        BookService bookService = new BookService(bookRepositoryMock);

        assertThat(bookService.findBookById("1")).isEqualTo(book);
    }

}