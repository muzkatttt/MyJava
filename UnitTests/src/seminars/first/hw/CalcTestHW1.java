package seminars.first.hw;

import static org.assertj.core.api.Assertions.*;

public class CalcTestHW1 {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 4500.00 == CalculatorHW1.calculateDiscount(5_000.00, 10);
        assert 970.00 == CalculatorHW1.calculateDiscount(1000.00, 3);
        assert 4950.00 == CalculatorHW1.calculateDiscount(5000.00, 5);

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(CalculatorHW1.calculateDiscount(5000.00, 10)).isEqualTo(4500.00);
        assertThat(CalculatorHW1.calculateDiscount(5000.00, 5)).isEqualTo(4750.00);
        assertThat(CalculatorHW1.calculateDiscount(5000.00, 1)).isEqualTo(4950.00);

        // Проверка ожидаемого исключения с использованием утверждений AssertJ:
        try {
            CalculatorHW1.calculateDiscount(-1.0, -1);
        } catch (ArithmeticException e) {
            assertThatThrownBy(() ->
                    CalculatorHW1.calculateDiscount(0, -1)).isInstanceOf(ArithmeticException.class);
        }
        assertThatThrownBy(() ->
                CalculatorHW1.calculateDiscount(10, -5)).isInstanceOf(ArithmeticException.class);
    }
}
