package ru.gb.springbootlesson10.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorHistoryTest {

    @Test
    void logOperationSuccess() {
        Storage storageMock = Mockito.mock(Storage.class);

        CalculatorHistory calculatorHistory = new CalculatorHistory(storageMock);
        Mockito.when(storageMock.save("1 + 1 = 2")).thenReturn(true);

        Assertions.assertDoesNotThrow(() -> calculatorHistory.logOperation(1, 1, 2));
    }

    @Test
    void logOperationRuntimeException() {
        Storage storageMock = Mockito.mock(Storage.class);

        CalculatorHistory calculatorHistory = new CalculatorHistory(storageMock);
        Mockito.when(storageMock.save("1 + 1 = 2")).thenReturn(false);

        Assertions.assertThrows(RuntimeException.class, () -> calculatorHistory.logOperation(1, 2, 2));
    }
}