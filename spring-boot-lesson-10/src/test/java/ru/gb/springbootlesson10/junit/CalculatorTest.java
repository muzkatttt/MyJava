package ru.gb.springbootlesson10.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorTest {

    @Test
    void sum() {
        CalculatorHistory calculatorHistoryMock = Mockito.mock(CalculatorHistory.class);

        Calculator calculator = new Calculator(calculatorHistoryMock);
        int sum = calculator.sum(5, 3);

        Assertions.assertEquals(8, sum);

        Mockito.verify(calculatorHistoryMock).logOperation(5, 3, 8);
    }
}