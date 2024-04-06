package ru.gb.springbootlesson8.hwsem8;

import org.springframework.stereotype.Service;

@Service
public class ReceiptService {
    private ReceiptRepository receiptRepository;

    public Double getSum(){
        return receiptRepository.summaPoMarshrutu();
    }

}
