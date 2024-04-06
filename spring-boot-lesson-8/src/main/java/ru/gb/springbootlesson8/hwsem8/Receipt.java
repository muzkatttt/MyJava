package ru.gb.springbootlesson8.hwsem8;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
@Slf4j
public class Receipt {
    String numberReceipt; // номер маршрута
    Double hourlyRate004; // часовая тарифная ставка
    Double officeHours; // отработанные часы
    Double harmfulWorkingConditions057; // доплата за вредные условия труда

    public Receipt(String numberReceipt, Double hourlyRate004, Double officeHours, Double harmfulWorkingConditions057) {
        this.numberReceipt = numberReceipt;
        this.hourlyRate004 = hourlyRate004;
        this.officeHours = officeHours;
        this.harmfulWorkingConditions057 = harmfulWorkingConditions057;
    }

    public Receipt(String numberReceipt, Double hourlyRate004, Double officeHours) {
        this.numberReceipt = numberReceipt;
        this.hourlyRate004 = hourlyRate004;
        this.officeHours = officeHours;
    }
}
