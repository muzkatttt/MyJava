package ru.gb.diplom_muzkat.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReceiptTest {
    @InjectMocks
    private Receipt receipt;

    public ReceiptTest() {
        MockitoAnnotations.openMocks(this);
        receipt = new Receipt("2024-03-05 08:00:00", "2024-03-05 18:00:00");
    }

    @Test
    public void testReceiptNotNull() {
        assertNotNull(receipt);
    }

    @Test
    public void testGetTimeOfStart() {
        assertEquals("2024-03-05 08:00:00", receipt.getTimeOfStart());
    }

    @Test
    public void testGetTimeOfFinish() {
        assertEquals("2024-03-05 18:00:00", receipt.getTimeOfFinish());
    }

}

