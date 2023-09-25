package seminars.first.lection;


import seminars.first.model.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LectionHomeWork {

    public static void main(String[] args) {
        // Примерные решения домашних заданий из 1 лекции:
        method1();
        method2();
        method3();
    }

    /**
     * 1. Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
     * необходимые проверки для него используя граничные случаи
     */
    public static void method1() {
        assertThatThrownBy(() ->
                Calculator.squareRootExtraction(0)
        ).isInstanceOf(ArithmeticException.class);
    }

    /**
     * 2. Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
     */
    public static void method2() {
        assertThatThrownBy(() ->
                Calculator.calculation(5, 0, '/')
        ).isInstanceOf(ArithmeticException.class);
    }

    /**
     * 3. Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
     * в каком случае стандартное сообщение об ошибке будет более информативным?
     */
    public static void method3() {
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }
        assert 8 == Calculator.calculation(2, 6, '+');
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
    }
}
