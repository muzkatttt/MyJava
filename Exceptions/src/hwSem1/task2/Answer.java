package hwSem1.task2;

import java.util.Arrays;

public class Answer {
    /*
    Разность двух массивов
    Реализуйте метод subArrays, принимающий в качестве аргументов
    два целочисленных массива a и b, и возвращающий новый массив c,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.
    Напишите свой код в методе subArrays класса Answer.
    Метод subArrays принимает на вход два параметра:
    int[] a - первый массив
    int[] b - второй массив

    a = new int[]{4, 5, 6};
    b = new int[]{1, 2, 3};

    Вывод: [3, 3, 3]

    a = new int[]{4, 5, 6};
    b = new int[]{1, 2, 3, 5};

    Вывод: [0]
     */
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        //a = new int[]{4, 5, 6};
        //b = new int[]{1, 2, 3, 4};
        int[] c = new int[a.length];
        if (a.length != b.length) {
            return new int[]{0};
            //throw new RuntimeException("Массивы не равны");
        } else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
                Arrays.stream(c).toArray();
                //System.out.println(c);
                //i++;
                }
            }
            return c;
        }

        // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    }

