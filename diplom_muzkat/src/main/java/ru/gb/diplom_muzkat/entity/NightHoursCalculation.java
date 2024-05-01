package ru.gb.diplom_muzkat.entity;

import org.springframework.stereotype.Component;


@Component
public class NightHoursCalculation {
    private Receipt receipt;
    private final String dateOfStart = receipt.getTimeOfStart();
    private final String dateOfFinish = receipt.getTimeOfFinish();

}
