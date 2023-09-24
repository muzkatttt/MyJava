package hwSem2;

import java.util.Scanner;

public class Task4 {
    /*
    Разработайте программу, которая выбросит Exception,
    когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите непустую строку далее \n>>> ");
        String startString = scanner.nextLine();
        startString = startString.trim();
        if (startString.isEmpty()) {
            throw new IllegalArgumentException("Пустая строка, повторите ввод");
        } else {
            System.out.print("Введенная строка >>>\n");
            System.out.println(startString);
        }
    }
}

