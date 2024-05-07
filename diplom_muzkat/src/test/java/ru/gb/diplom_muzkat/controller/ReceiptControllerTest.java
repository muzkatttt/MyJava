package ru.gb.diplom_muzkat.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import ru.gb.diplom_muzkat.entity.Receipt;
import ru.gb.diplom_muzkat.service.ReceiptService;


import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class ReceiptControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReceiptService receiptService;

    @InjectMocks
    private ReceiptController receiptController;


    @Test
    void testGetByDateStart() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .get(
                "/receipt/date")
                        .param("date", "2024-04-01 08:00:00"))
                .andExpect(
                        MockMvcResultMatchers.status().isOk())
                .andExpect(
                        MockMvcResultMatchers.content()
                                .string("Дата и время начала работы по маршруту: 2024-04-01 08:00:00"));
    }

    @Test
    void testFindReceiptById() {
        Long id = 1L;
        Receipt receipt = new Receipt();
        receipt.setId(id);
        when(receiptService.findById(id)).thenReturn(receipt);

        ResponseEntity<Receipt> response = receiptController.findReceiptById(id);

        assert response.getStatusCode().equals(HttpStatus.OK);
        assert response.getBody().getId().equals(id);
    }

}