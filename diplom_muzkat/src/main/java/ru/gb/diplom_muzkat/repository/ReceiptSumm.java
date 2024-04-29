package ru.gb.diplom_muzkat.repository;

import org.springframework.stereotype.Component;

@Component
public class ReceiptSumm {

    private CalculateSumFromReceipt repository;

    private Double summaPoMarshrutu(){
        return repository.tarif
                + repository.reschet025()
                + repository.raschet151()
                + repository.raschet152()
                + repository.raschetBonus011()
                + repository.reschet057();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Оплата по маршруту{");
        sb.append("numberReceipt=").append(repository.getReceipt().getId());
        sb.append(", hourlyRate004=").append(repository.getNsi().getHourlyRate004());
        sb.append(", officeHours=").append(repository.getReceipt().getOfficeHours());
        sb.append(", qualification025=").append(repository.reschet025());
        sb.append(", longShoulder151=").append(repository.raschet151());
        sb.append(", heavyWeight152=").append(repository.raschet152());
        sb.append(", harmfulWorkingConditions057=").append(repository.reschet057());
        //sb.append(", nightHours023=").append(repository.raschet023());
        sb.append(", summ=").append(summaPoMarshrutu());
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }



}
