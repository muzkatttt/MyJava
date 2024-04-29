package ru.gb.diplom_muzkat.repository;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import ru.gb.diplom_muzkat.entity.Nsi;
import ru.gb.diplom_muzkat.entity.Receipt;

import java.util.LinkedList;
import java.util.Queue;


@Component
@Data
public class CalculateSumFromReceipt {

    private Queue<Receipt> list = new LinkedList<>();
    public CalculateSumFromReceipt() {
        list.add(new Receipt(" 2024.03.01 08:00:00", "2024.03.01 18:00:00"));
        list.add(new Receipt(" 2024.03.02 08:00:00", "2024.03.02 18:00:00"));
        list.add(new Receipt(" 2024.03.03 08:00:00", "2024.03.03 18:00:00"));
        list.add(new Receipt(" 2024.03.04 08:00:00", "2024.03.04 18:00:00"));
        list.add(new Receipt(" 2024.03.05 08:00:00", "2024.03.05 18:00:00"));
    }

    private Receipt receipt;
    private Nsi nsi;

    Double tarif = nsi.getHourlyRate004() * receipt.getOfficeHours();

    public Double raschet151() {
        Double doplata151 = tarif * nsi.getLongShoulder151();
        return doplata151;
    }

    public Double raschet152(){
        Double doplata152 = tarif * nsi.getHeavyWeight152();
        return doplata152;
    }

    public Double raschetBonus011(){
        Double bonus011 = tarif * nsi.getBonus011();
        return bonus011;
    }

    public Double reschet025(){
        // расчет доплаты за квалификацию работника
        Double doplata025 = tarif * nsi.getQualification025();
        return doplata025;
    }

    public Double reschet057(){
        // расчет доплаты за работу во вредных условиях труда
        Double doplata057 = tarif * nsi.getHarmfulWorkingConditions057();
        return doplata057;
    }

}
