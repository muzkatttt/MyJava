package ru.gb.diplom_muzkat.service;

import ru.gb.diplom_muzkat.entity.Receipt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReceiptToFile {
    public void writeReceiptToFile(Receipt receipt) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла для записи: \n>>> ");
        String fileName = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fileName, true);
        // true - добавлять файл, false - перезаписывает файл
//        String userDataString = String.join("><",
//                String.valueOf(receipt.getNumberReceipt(), "<" + receipt.getHourlyRate004(),
//                        receipt.getOfficeHours(),
//                        receipt.getQualification025(),
//                        receipt.getLongShoulder151(),
//                        receipt.getHeavyWeight152() + ">");
        fileWriter.write(String.valueOf(receipt));
        fileWriter.write("\n");
        fileWriter.close();
        System.out.println("Данные записаны в файл");
    }
}
