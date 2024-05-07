package ru.gb.diplom_muzkat.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.server.ResponseStatusException;
import ru.gb.diplom_muzkat.entity.Receipt;
import ru.gb.diplom_muzkat.repository.JpaReceiptRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class ReceiptServiceTest {

    @Mock
    private JpaReceiptRepository jpaReceiptRepository;

    @InjectMocks
    private ReceiptService receiptService;

    public ReceiptServiceTest() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void findById() {
        Long id = 1L;
        Receipt mockReceipt = new Receipt("2024-04-01 08:00:00", "2024-04-01 18:00:00");
        when(jpaReceiptRepository.findById(id)).thenReturn(Optional.of(mockReceipt));

        Receipt foundReceipt = receiptService.findById(id);

        assertNotNull(foundReceipt);
        assertEquals("2024-04-01 08:00:00", foundReceipt.getTimeOfStart());
        assertEquals("2024-04-01 18:00:00", foundReceipt.getTimeOfFinish());
    }

    @Test
    public void findById_WhenReceiptDoesNotExist_ShouldThrowException() {
        Long id = 1L;
        when(jpaReceiptRepository.findById(id)).thenReturn(Optional.empty());

        Exception exception = assertThrows(ResponseStatusException.class, () -> {
            receiptService.findById(id);
        });

        String expectedMessage = ReceiptService.NOT_FOUND_MESSAGE + id;
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void addNewReceipt() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void getAll() {
    }

    @Test
    void findReceipt() {
    }

}