package ru.gb.diplom_muzkat;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class ListReceipts {

    Queue<Receipt> receiptQueue = new LinkedList<>();
    Receipt receipt;

    public ListReceipts() {
        receipt.summaPoMarshrutu();
    }

    public Queue<Receipt> getReceiptQueue() {
        return receiptQueue;
    }

    public void addReceiptToQueue(Receipt receipt){
        receiptQueue.add(receipt);
    }

    public void printReceiptQueue(Queue<Receipt> receiptQueue){
        System.out.println(receiptQueue);
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
