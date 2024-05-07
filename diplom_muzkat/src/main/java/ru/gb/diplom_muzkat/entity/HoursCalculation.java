package ru.gb.diplom_muzkat.entity;

import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class HoursCalculation {
    // расчет доплаты за работу в ночное время
    private Receipt receipt;
    private final String dateOfStart = receipt.getTimeOfStart();
    private final String dateOfFinish = receipt.getTimeOfFinish();

    public Date stringDateFormatToDateTime(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateAfterFormat = dateFormat.parse(date);
        System.out.println(dateAfterFormat);
        return dateAfterFormat;
    }

    public Double dateToDouble(String date) throws ParseException {
        Double resultTime = Double.parseDouble(date);
        System.out.println(resultTime);
        return resultTime;
    }
}
