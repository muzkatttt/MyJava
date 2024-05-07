package ru.gb.diplom_muzkat.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gb.diplom_muzkat.controller.ReceiptController;


import java.util.function.BooleanSupplier;

public class ReceiptSummTest {
    @Autowired
    ReceiptController receiptController;

    @Autowired
    Receipt receipt;

    @Test
    void findReceiptIsOk() {

        Mockito.doNothing().when(receipt).getId();
        Assertions.assertTrue((BooleanSupplier) receiptController.findReceiptById(receipt.getId()));
    }

}
