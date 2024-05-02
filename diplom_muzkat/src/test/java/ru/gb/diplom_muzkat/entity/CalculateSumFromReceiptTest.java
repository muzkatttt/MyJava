package ru.gb.diplom_muzkat.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculateSumFromReceiptTest {

    private Nsi nsi;
    private Receipt receipt;
    private CalculateSumFromReceipt calculateSum;

    @BeforeEach
    void setUp() {
        nsi = mock(Nsi.class);
        nsi.hourlyRate004 = 300.00;
        receipt = mock(Receipt.class);
        receipt.setOfficeHours(10.00);
        when(receipt.getOfficeHours()).thenReturn(10.00);
        calculateSum = new CalculateSumFromReceipt(receipt, nsi);
    }

    @Test
    void testRaschet151() {
        when(nsi.getLongShoulder151()).thenReturn(0.30);
        when(nsi.getHourlyRate004()).thenReturn(100.0);
        assertEquals(30.0, calculateSum.raschet151());
    }

    @Test
    void testRaschet152() {
        when(nsi.getHeavyWeight152()).thenReturn(0.1);
        when(nsi.getHourlyRate004()).thenReturn(10.0);
        assertEquals(1.0, calculateSum.raschet152());
    }

    @Test
    void testRaschetBonus011() {
        when(nsi.getBonus011()).thenReturn(0.3);
        when(nsi.getHourlyRate004()).thenReturn(20.0);
        assertEquals(6.0, calculateSum.raschetBonus011());
    }

    @Test
    void testRaschet025() {
        when(nsi.getQualification025()).thenReturn(0.1);
        when(nsi.getHourlyRate004()).thenReturn(20.0);
        assertEquals(20.0, calculateSum.reschet025());
    }

    @Test
    void testRaschet057() {
        when(nsi.getHarmfulWorkingConditions057()).thenReturn(0.9);
        when(nsi.getHourlyRate004()).thenReturn(20.0);
        assertEquals(180.0, calculateSum.reschet057());
    }
}
