package ru.gb.diplom_muzkat.service;
import org.springframework.stereotype.Component;
import ru.gb.diplom_muzkat.entity.ReceiptSumm;

import java.util.LinkedList;
import java.util.Queue;


@Component
public class ListReceipts {

    Queue<ReceiptSumm> receiptQueue = new LinkedList<>();

    ReceiptSumm receiptSumm;

    public Queue<ReceiptSumm> getAllReceipts(){
        receiptQueue.add(receiptSumm);
        return receiptQueue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListReceipts{");
        sb.append("receiptQueue=").append(receiptQueue);
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }

}
