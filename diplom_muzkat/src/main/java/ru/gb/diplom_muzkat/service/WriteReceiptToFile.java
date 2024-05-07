package ru.gb.diplom_muzkat.service;

import org.springframework.stereotype.Service;
import ru.gb.diplom_muzkat.entity.Receipt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Service
public class WriteReceiptToFile {
    public void writeReceiptToFile(Receipt receipt) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла для записи: \n>>> ");
        String fileName = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write(String.valueOf(receipt));
        fileWriter.write("\n");
        fileWriter.close();
        System.out.println("Данные записаны в файл");
    }
}
