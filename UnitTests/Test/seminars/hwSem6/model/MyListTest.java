package seminars.hwSem6.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyListTest {

    // unit-тест проверка метода сравнения средних значений двух списков (средние значения равны)
    @Test
    void compareArrayAverageEquals() {
        int[] array1 = new int[]{1,1,1,1,1};
        int[] array2 = new int[]{1,1,1,1,1};

        assertThat(Arrays.stream(array1).average()).isEqualTo(Arrays.stream(array2).average());
    }

    // unit-тест проверка метода сравнения средних значений двух списков (средние значения не равны)
    @Test
    void compareArrayAverageNotEquals() {
        int[] array1 = new int[]{2,2,2,2,3};
        int[] array2 = new int[]{1,1,1,1,1};

        assertThat(Arrays.stream(array1).average()).isNotEqualTo(Arrays.stream(array2).average());
    }


    // unit-тест проверка метода вычисления среднего значения списка
    @Test
    void averageArray() {
        int[] array3 = new int[]{1,1,1,1,1};
        double resultAverage;
        double sum = 0;
        for (int j : array3) {
            sum = sum + j;
        }
        resultAverage = Math.round(sum / array3.length);

        assertThat(resultAverage).isEqualTo(1.0);
    }


    // unit-тест проверка метода создания списка
    @Test
    void createArray() {
        Random random = new Random();
        int[] array = new int[1];
        // здесь задала ограничение длины списка, равное 1, чтобы проверить, какой длины список сформируется
        // и ввела ограничение для рандомных значений в списке, которые могут включать только 1
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt(1, 2));
        }

        assertThat(array).containsExactly(1);
    }

    // тест, который проверяет создание нового списка в классе MyList
    @Test
    void createMyListTest(){
        MyList myListMock = mock(MyList.class);
        when(myListMock.createArray()).thenReturn(new int[]{1,1,1,1,1});
    }

}