import java.io.*;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task3 {
    public static void main(String[] args) {
        ex3("Test", 20);
    }

    static void ex3(String s, int n){
        /*
       Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    static void saveToFile(String s) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        String path = "test.txt";
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.append(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        System.out.println("Тест");
        fileHandler.close();
    }

    static String repeatString(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
//            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    static boolean ex2_1(String s){
        s = s.replace(" ", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }
    static boolean ex2(String s){
        /*
        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
        (возвращает boolean значение).
        Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
         */

        s = s.replace(" ", "");
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.reverse();
        return stringBuilder1.toString().equalsIgnoreCase(s);
    }

}

