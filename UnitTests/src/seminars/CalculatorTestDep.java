import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTestDep {

    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        // try {
        //     Calculator.calculation(8, 4, '_');
        // } catch (IllegalStateException e) {
        //     if (!e.getMessage().equals("Unexpected value operator: _")) {
        //         throw new AssertionError("Ошибка в методе");
        //     }
        // }

        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 8 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

        // Примерные решения домашних заданий из 1 лекции:

        // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
        // необходимые проверки для него используя граничные случаи
        // assertThatThrownBy(() ->
        //         Calculator.squareRootExtraction(0, 1, -1)
        // ).isInstanceOf(SomeStateException.class);

        // HW1.2: Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
        // assertThatThrownBy(() ->
        //        Calculator.calculation(5, 0, '/')
        // ).isInstanceOf(ArithmeticException.class);

        // HW1.3: Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
        // в каком случае стандартное сообщение об ошибке будет более информативным?
        // if (0 != Calculator.calculation(2, 6, '+')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        //   assert 0 == Calculator.calculation(2, 6, '+');
        //    assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(0);

        //HW2.3L: Добавьте функцию возведения в степень в калькулятор и протестируйте
        assertThat(Calculator.pow(10, 0)).isEqualTo(1);
        assertThat(Calculator.pow(10, 1)).isEqualTo(10);
        assertThat(Calculator.pow(2, 8)).isEqualTo(256);

        // HW2.1: Нужно написать в калькуляторе метод вычисления суммы покупки (метод принимает сумму, процент скидки и
        // возвращает сумму со скидкой) и проверить его используя AssertJ (отрицательное числа, 0, дроби, проценты >=100%, обычные скидки).
        // Все ошибки должны быть обработаны, при вводе недопустимых аргументов *можно* выбрасывать (`throw new ArithmeticException("Суть ошибки");`),
        // но нужно проверить, что все ошибки проверяются в тестах. (Заготовки метода уже есть в классе `Calculator` - `calculatingDiscount`)

        // Отрицательные числа. Сумма покупки
        // Ожидаемый результат: ошибка ArithmeticException с описанием "Сумма покупки не может быть отрицательной"
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-1000, 50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");

        // Отрицательные числа. Процент
        // Ожидаемый результат: ошибка ArithmeticException с описанием "Скидка должна быть в диапазоне от 0 до 100%"
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(1000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");

        // Процент > 100
        // Ожидаемый результат: ошибка ArithmeticException с описанием "Скидка должна быть в диапазоне от 0 до 100%"
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(1000, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");

        // Тесты на корректность результата
        // Ожидаемый результат: Метод возвращает верную сумму 1000 - 25%*1000 = 750

        assertThat(Calculator.calculatingDiscount(1000, 25)).isEqualTo(750);
        assertThat(Calculator.calculatingDiscount(1000, 100)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(1000, 0)).isEqualTo(1000);


        // Проверка максимального и минимального значения, которое может хранить тип int
        assert Integer.MAX_VALUE == Calculator.calculation(Integer.MAX_VALUE - 1, 1, '+');
        assert Integer.MIN_VALUE == Calculator.calculation(Integer.MIN_VALUE + 1, -1, '+');

        // Проверка переполнения
        try {
            Calculator.calculation(Integer.MAX_VALUE, 1, '+');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (ArithmeticException e) {
            assert true; // Мы ожидаем исключение ArithmeticException при переполнении
        }
        try {
            Calculator.calculation(Integer.MIN_VALUE, -1, '+');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (ArithmeticException e) {
            assert true; // Мы ожидаем исключение ArithmeticException при переполнении
        }
        // Проверка деления на ноль
        try {
            Calculator.calculation(1, 0, '/');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (ArithmeticException e) {
            assert true; // Мы ожидаем исключение ArithmeticException при делении на ноль
        }

        // Проверка неправильного оператора
        try {
            Calculator.calculation(1, 1, 'a');
            assert false; // Если мы здесь, значит, ожидаемого исключения не было
        } catch (IllegalStateException e) {
            assert true; // Мы ожидаем исключение IllegalStateException при использовании неправильного оператора
        }


    }
}