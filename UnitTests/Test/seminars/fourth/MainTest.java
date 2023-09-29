package seminars.fourth;

import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class MainTest {

    /**
     * 4.0. Проверка работы Mockito
     */
     @Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова  “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
      @Test
      public void iteratorWillReturnHelloWorld() {
          // Arrange
          Iterator iteratorMock = mock(Iterator.class);
          // для нескольких методов через запятую
          when(iteratorMock.next()).thenReturn("Hello", "World").thenReturn("Hello", "World");
          // Act
          String result = iteratorMock.next() + " " + iteratorMock.next();
          assertEquals("Hello World", result);
      }

      /*
      @Test
      public void iteratorWillReturnHelloWorld() {
          // Arrange
          Iterator iteratorMock = mock(Iterator.class);
          when(iteratorMock.next()).thenReturn("Hello", "World");
//          when(iteratorMock.next()).thenReturn("Hello", "World").thenReturn();
          // Act
          String result = iteratorMock.next() + " " + iteratorMock.next();
          // ...
          assertEquals("Hello World", result);
      }
       */
}