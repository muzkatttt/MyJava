package ru.gb.diplom_muzkat.repository;

import org.springframework.stereotype.Repository;
import ru.gb.diplom_muzkat.entity.Receipt;


@Repository
public class NightHoursCalculation {
    private Receipt receipt;

    private final String dateOfStart = receipt.getTimeOfStart();
    private final String dateOfFinish = receipt.getTimeOfFinish();

}
