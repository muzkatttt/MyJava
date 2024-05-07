package ru.gb.diplom_muzkat.entity;

import org.springframework.stereotype.Component;

@Component
public class ReceiptSumm {

    private CalculateSumFromReceipt calculateSumFromReceipt;
    private Receipt receipt;

    private Double summaPoMarshrutu(){
        return calculateSumFromReceipt.tarif
                + calculateSumFromReceipt.reschet025()
                + calculateSumFromReceipt.raschet151()
                + calculateSumFromReceipt.raschet152()
                + calculateSumFromReceipt.raschetBonus011()
                + calculateSumFromReceipt.reschet057();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Оплата по маршруту{");
        sb.append("numberReceipt=").append(receipt.getId());
        sb.append(", hourlyRate004=").append(calculateSumFromReceipt.getNsi().getHourlyRate004());
        sb.append(", officeHours=").append(receipt.getOfficeHours());
        sb.append(", qualification025=").append(calculateSumFromReceipt.reschet025());
        sb.append(", longShoulder151=").append(calculateSumFromReceipt.raschet151());
        sb.append(", heavyWeight152=").append(calculateSumFromReceipt.raschet152());
        sb.append(", harmfulWorkingConditions057=").append(calculateSumFromReceipt.reschet057());
        sb.append(", summ=").append(summaPoMarshrutu());
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }



}
