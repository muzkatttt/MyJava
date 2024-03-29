package seminars.hwSem6;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


class ControllerTest {
    final Controller controllerMock = mock(Controller.class);

    final int[] array = new int[]{1, 1, 1, 1, 1};
    final double averageArray = 1.0;

    // --Commented out by Inspection (11.10.2023, 20:34):int[] array1 = new int[]{2, 2, 2, 2, 2};
    final double averageArray1 = 2.0;


    // тест, что в контроллере создается новый массив с заданными значениями
    @Test
    void createArrayTest() {

        when(controllerMock.createArray()).thenReturn(array);

    }
    // тест, который проверяет, что в контроллере при вызове метода сравнения средних
    // значений возвращается корректное значение averageArray
    @Test
    void averageArrayTest() {
        when(controllerMock.averageArray(array)).thenReturn(averageArray);
    }


    // тест, который проверяет корректность сравнения средних значений массивов
    @Test
    void compareArrayTest() {
        controllerMock.compareArray(1.0, 2.0);

        verify(controllerMock, times(1)).compareArray(averageArray, averageArray1);

    }

}