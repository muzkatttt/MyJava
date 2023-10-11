package seminars.hwSem6.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AbstractClassTest {

    // unit-test проверка создания массива определенной длины
    @Test
    void createArrayTest() {
        int[] array = new int[10];

        assertThat(array).hasSize(10);
        assertThat(array.length).isEqualTo(10);
    }

}