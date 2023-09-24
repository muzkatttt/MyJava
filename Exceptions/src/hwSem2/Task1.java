package hwSem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static void main(String[] args){

    boolean inputFromUser = true;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(inputFromUser) {
            System.out.print("Введите число с плавающей точкой >>>\n");
            try {
                float number = Float.parseFloat(bufferedReader.readLine());
                System.out.println("Введенное число >>> " + number);
                inputFromUser = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ввод некорректный. Повторите ввод >>>\n");
            }
        }
    }
}

