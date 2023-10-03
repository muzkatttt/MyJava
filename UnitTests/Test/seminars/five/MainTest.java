package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    //5.1.
    /*
    Создайте два модуля. Первый модуль генерирует список случайных чисел.
    Второй модуль находит максимальное число в этом списке.
    Вам нужно сначала написать юнит-тесты для каждого модуля,
    затем написать интеграционный тест, который проверяет, что оба модуля работают вместе правильно
     */

    @Test
    void testGenerateNumbers() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();

        assertThat(randomNumberModule.generateList(5).size()).isEqualTo(5);
    }

    @Test
    void testMaxNumber() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        assertThat(maxNumberModule.maxNumber(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))).isEqualTo(8);
    }

    @Test
    void integarationTestTask1() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        ArrayList<Integer> listNumbers = randomNumberModule.generateList(5);
        // предполагается, что метод maxNumber() написан с помощью алгоритмов
        assertThat(maxNumberModule.maxNumber(listNumbers)).isEqualTo(Collections.max(listNumbers));
    }

    /* 5.2. решение в классе UserTest */

    /* 5.3
    У вас есть сервис по обработке заказов, состоящий из двух классов:
    OrderService и PaymentService. Класс OrderService обрабатывает заказы и
    делает вызовы к PaymentService для обработки платежей.
    Ваша задача - написать интеграционный тест, который проверяет,
    что OrderService и PaymentService взаимодействуют корректно */

    @Test
    void payTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        String orderId = "0012";
        double amount = 500.0;

        assertTrue(orderService.placeOrder(orderId, amount));
        //assertFalse(orderService.placeOrder(orderId, amount));
    }
    //5.4. решение в классе SeleniumTest

}

