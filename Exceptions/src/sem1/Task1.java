package sem1;

import java.util.Scanner;

public class Task1 {
    /* задача 0
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    Если длина массива меньше некоторого заданного минимума,
    метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

    Задача 1
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
    если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    в качестве кода ошибки.
    если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    если вместо массива пришел null, метод вернет -3
    придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
    Напишите метод, в котором реализуйте взаимодействие с пользователем.
    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
    обработает возвращенное значение и покажет читаемый результат пользователю.
    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     */
    final static int minSize = 5;
    public static void main(String[] args) {
        int value = inputInt();

        System.out.println(decoder(checkLength(new int[]{1, 3, 4, 5, 5}, value)));
        //System.out.println(decoder(checkLength(null, value)));
    }

    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение >>>\n");
        return scanner.nextInt();
    }

    public static String decoder(int result) {
        return switch (result) {
            case -1 -> "Error array size";
            case -2 -> "Value not found";
            case -3 -> "Array is Null";
            default -> "Index is " + result;
        };
    }
    public static int checkLength(int[] arr, int value) {
        if (arr == null) return -3;
        if (arr.length < minSize) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -2;
    }
}
