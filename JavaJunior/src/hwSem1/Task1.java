package hwSem1;

import java.awt.*;
import java.util.Arrays;

public class Task1 {
    int[] array = {1, 2, 2, 1, 2, 22};

    public static void main(String[] args) {
        /* ДЗ к семинару 1 Java Junior
        1. Напишите программу, которая использует Stream API для обработки списка чисел.
           Программа должна вывести на экран среднее значение всех четных чисел в списке.
        2. *Дополнительная задaча: Переработать метод балансировки корзины товаров cardBalancing()
        с использованием Stream API
        */
        int[] array = {1, 2, 2, 1, 2, 22};
        Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array).filter(i -> i % 2 == 0).average().stream().forEach(System.out::print);
    }
}
