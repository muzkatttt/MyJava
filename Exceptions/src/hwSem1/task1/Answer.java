package hwSem1.task1;

import static java.lang.Integer.parseInt;

public class Answer {
    /*
    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
    Метод divisionByZero - Деление на 0
    Метод numberFormatException - Ошибка преобразования строки в число
    Важно: они не должны принимать никаких аргументов
     */
    public static void arrayOutOfBoundsException() {
        int[] array = new int[]{1, 2, 3, 4};
        int index = array[10];
    }

    public static void divisionByZero() {
        int a = 1;
        int b = 0;
        int c = a/b;
    }

    public static void numberFormatException() {
        String message = "Test";
        int value = Integer.parseInt(message);
    }

    }
