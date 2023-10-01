package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SomeServiceTest {
   // 3.1.
    private SomeService someService;

    @BeforeEach
    // beforeEach отличается от beforeAll
    // beforeEach запускается перед каждым тестом
    // beforeAll запускается один раз пред всеми тестами
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void testReturnFizz() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void testReturnBuzz() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void testReturnFizzBuzz() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnEcho() {
        assertThat(someService.fizzBuzz(14)).isEqualTo(" " + 14);
    }

    @Test
    void firstSixElement() {
        assertThat(someService.firstLast6(new int[] {1, 2, 3, 4, 5, 6})).isTrue();
    }

    @Test
    void lastSixElement() {
        SomeService someService = new SomeService();
        assertThat(someService.firstLast6(new int[] {1, 3, 4, 6})).isTrue();
        // assertTrue(someservice.firstLast6(new int[] {1, 2, 3, 6}));
    }

    @Test
    void firstSixElementCheckOutArrayFalse() {
        assertThat(someService.firstLast6(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isFalse();
    }

    @Test
    void firstLastNoSixElementFalse() {
        assertFalse(someService.firstLast6(new int[] {1, 2, 4}));
    }
//    @Test
//    void insufficientCoverageTest() {
// данные ветки необходимо перенести в отдельные тесты, в одном тесте их быть не должно
//        System.out.println(someService.calculatingDiscount(2000, 10)); // sout не должен заходить в тесты
//        // обычная скидка
//        assertThat(someService.calculatingDiscount(2000, 50)).isEqualTo(1000);
//        // обычная скидка
//        assertThat(someService.calculatingDiscount(2000, 100)).isEqualTo(0);
//        // обычная скидка
//        assertThat(someService.calculatingDiscount(2000, 0)).isEqualTo(2000);
//
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(2000, 101))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
//
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(2000, -10))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // отрицательное значение скидки
//    }

    @Test
    void discountDegreeZero() {
        assertThatThrownBy(() -> someService.calculatingDiscount(-2000, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }
    @Test
    void percentSubZero() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // отрицательное значение скидки
    }
    @Test
    void percentDiscountMoreThanPrice() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void discountIsEqualsPrice() {
        assertThat(someService.calculatingDiscount(2000, 100)).isEqualTo(0);
    }

    @Test
    void goodDiscount() {
        assertThat(someService.calculatingDiscount(2000, 50)).isEqualTo(1000);
    }

    @Test
    void discountIsEqualsZero() {
        assertThat(someService.calculatingDiscount(2000, 0)).isEqualTo(2000);

    }

    @Test
    void luckySumA() {
        assertThat(someService.luckySum(13, 2, 3)).isEqualTo(5);
    }

    @Test
    void luckySumB() {
        assertThat(someService.luckySum(2,13,3)).isEqualTo(5);
    }

    @Test
    void luckySumC() {
        assertThat(someService.luckySum(3,2,13)).isEqualTo(5);
    }

    @Test
    void luckySumNot13() {
        assertThat(someService.luckySum(1,2,3)).isEqualTo(6);
    }
}