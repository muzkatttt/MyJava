package ru.gb.diplom_muzkat.service;
import org.springframework.stereotype.Service;
import ru.gb.diplom_muzkat.entity.Receipt;
import ru.gb.diplom_muzkat.entity.ReceiptSumm;
import java.util.LinkedList;
import java.util.Queue;


@Service
public class ListReceiptsService {
    Queue<ReceiptSumm> receiptQueue = new LinkedList<>();
    ReceiptSumm receiptSumm;

    Receipt receipt;

    public Queue<ReceiptSumm> getAllSumm(){
        receiptQueue.add(receiptSumm);
        return receiptQueue;
    }

    public Queue<Receipt> getAllReceipts(){
        Queue<Receipt> newQueue = new LinkedList<>();
        newQueue.add(receipt);
        return newQueue;
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
