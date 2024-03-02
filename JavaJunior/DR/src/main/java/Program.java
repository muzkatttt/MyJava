import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Начало моего проекта!");
        Receipt receipt1 = new Receipt("1", 268.43, 10.0, 10.0,
                30.0, 10.0);
        Receipt receipt2 = new Receipt("2", 268.43, 12.0, 10.0,
                30.0, 10.0);

        ListReceipts listReceipts = new ListReceipts();
        listReceipts.addReceiptToQueue(receipt1);
        listReceipts.addReceiptToQueue(receipt2);

        listReceipts.printReceiptQueue(listReceipts.receiptQueue);

        WriteReceiptToFile writeReceiptToFile = new WriteReceiptToFile();
        writeReceiptToFile.writeReceiptToFile(receipt1);

    }
}
