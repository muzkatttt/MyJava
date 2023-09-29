
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

//    public static void main(String[] args) {
//        // Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        // Случаи с неправильными аргументами
//        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
//        // try {
//        //     Calculator.calculation(8, 4, '_');
//        // } catch (IllegalStateException e) {
//        //     if (!e.getMessage().equals("Unexpected value operator: _")) {
//        //         throw new AssertionError("Ошибка в методе");
//        //     }
//        // }
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений:
//        assert 8 == Calculator.calculation(2, 6, '+');
//        assert 0 == Calculator.calculation(2, 2, '-');
//        assert 14 == Calculator.calculation(2, 7, '*');
//        assert 2 == Calculator.calculation(100, 50, '/');
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
//
//        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() ->
//                Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);
//
//        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
//        System.out.println(Calculator.squareRootExtraction(169));
//
//        // Примерные решения домашних заданий из 1 лекции:
//
//        // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
//        // необходимые проверки для него используя граничные случаи
//        // assertThatThrownBy(() ->
//        //         Calculator.squareRootExtraction(0, 1, -1)
//        // ).isInstanceOf(SomeStateException.class);
//
//        // HW1.2: Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
//        // assertThatThrownBy(() ->
//        //        Calculator.calculation(5, 0, '/')
//        // ).isInstanceOf(ArithmeticException.class);
//
//        // HW1.3: Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
//        // в каком случае стандартное сообщение об ошибке будет более информативным?
//        // if (0 != Calculator.calculation(2, 6, '+')) {
//        //     throw new AssertionError("Ошибка в методе");
//        // }
//        //   assert 0 == Calculator.calculation(2, 6, '+');
//        //    assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(0);
//    }

    @Test
    void evaluatesExpression() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 6, '+')).isEqualTo(8);
    }

    @Test
    void subtractionExpression() {
        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
    }

    @Test
    void multiplicationExpression() {
        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
    }

    @Test
    void divisionExpression() {
        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
    }

    @Test
    void expectedIllegalStateExpression() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> Calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
    }

    // <-------JUnit-Jupiter-Params
    @ParameterizedTest
    @ValueSource(chars = { '&', '#', '=' })
    void expectedIllegalStateExpressionToo(char i) {
        // Arrange
        Calculator calculator = new Calculator();
        char o = i;

        // Act
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            calculator.calculation(8, 4, o);
        });

        // Assert
        String expectedMessage = "Unexpected value operator: " + o;
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void getOperandCompletesCorrectlyWithNumbers() {
        String testedValue = "9"; // Значение для тестов
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in;  // Сохраняем ссылку на ввод с клавиатуры
        System.setIn(in); // Подменяем ввод

        Calculator.getOperand(); // Вызываем метод

        System.out.println(testedValue); // Для наглядности вывода
        System.setIn(inputStream); // Подменяем обратно
    }

    @Test
    void getOperandCompletesCorrectlyWithNotNumbers() {
        String testedValue = "K";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));
        assertThatThrownBy(() -> Calculator.getOperand())
                .isInstanceOf(IllegalStateException.class)
                .describedAs("Input error");
        System.setIn(inputStream);
        System.setOut(null);
    }
}