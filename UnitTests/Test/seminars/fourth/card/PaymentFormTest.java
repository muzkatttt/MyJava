package seminars.fourth.card;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */
    @Test
    public void methodPayWillCallMethodCharge(){
        CreditCard creditCardMock = mock(CreditCard.class);

        when(creditCardMock.getCardHolder()).thenReturn("CardHolder");
        when(creditCardMock.getCardNumber()).thenReturn("12234212");
        when(creditCardMock.getExpiryDate()).thenReturn("11.30");
        when(creditCardMock.getCvv()).thenReturn("011");

        PaymentForm paymentForm = new PaymentForm(creditCardMock);

        paymentForm.pay(100);
        // дублирование вызова метода pay для вызова ошибки
        // paymentForm.pay(100);
        // проверка метода через аргумент times(1)
        verify(creditCardMock, times(1)).charge(100);
    }



}