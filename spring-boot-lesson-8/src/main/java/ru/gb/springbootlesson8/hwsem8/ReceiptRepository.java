package ru.gb.springbootlesson8.hwsem8;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReceiptRepository {
    private Receipt receipt;

    public ReceiptRepository(String numberReceipt, Double hourlyRate004,
                             Double officeHours) {
        this.list.add(new Receipt("1e", 250.00, 12.00));
        this.list.add(new Receipt("2a", 250.00, 12.0));
    }

    private final List<Receipt> list = new ArrayList<>();

    public Double summaPoMarshrutu() {

        Double summ = receipt.hourlyRate004 * receipt.officeHours * (1.0 + 0.04 + 0.15);
        return summ;
    }

}
