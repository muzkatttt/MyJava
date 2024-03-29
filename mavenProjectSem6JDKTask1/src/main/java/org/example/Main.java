package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

import java.util.Arrays;
import java.util.Random;

public class Main {
/*
    В рамках выполнения задачи необходимо:
    Создать свой Java Maven проект;
    Добавьте зависимость commons-math3 (предназначена для решения математических задач) и
    изучить интерфейс библиотеки.
    Воспользоваться пакетом org.apache.commons.math3.stat и классом DescriptiveStatistics.
    Создать коллекцию из числовых элементов.
    С помощью объекта DescriptiveStatistics вычислить минимальное и максимальное значение,
    сумму и среднее арифметическое.
    Воспользоваться пакетом org.apache.commons.math3.util.
    С помощью класса ArithmeticUtils найти :
    факториал числа N.
    Наименьшее общее частное двух чисел
    Наибольший общий делитель двух чисел
    Проверить, что число N это степень двойки
     */

    public static void main(String[] args) {
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

        fillDescStat(descriptiveStatistics, 11, -100, 100);

        double min = descriptiveStatistics.getMin();
        double max = descriptiveStatistics.getMax();
        double average = descriptiveStatistics.getMean();
        double sum = descriptiveStatistics.getSum();

        double getElement = descriptiveStatistics.getElement(0);
        double countNumbersOfArray = descriptiveStatistics.getN();

        System.out.println(Arrays.toString(descriptiveStatistics.getValues()));
        System.out.printf("min: %.2f, max: %.2f, average: %.2f, sum: %.2f", min, max, average, sum);

        int a = 2;
        int b = 8;
        long factorial = ArithmeticUtils.factorial(a);
        long smallestCommonMultiple = ArithmeticUtils.lcm(a, b);
        long generalCommonDivisor = ArithmeticUtils.gcd(a, b);
        boolean isPowerOfTwo = ArithmeticUtils.isPowerOfTwo(b);
        System.out.printf("factorial: %d, SCM: %d, GCD: %d, isPower: %s",
                factorial, smallestCommonMultiple, generalCommonDivisor, isPowerOfTwo);

        System.out.printf("\nelement с заданным индексом равен %s", getElement);
        System.out.println("\nколичество элементов массива = "+ countNumbersOfArray);

    }

    private static int[] makeNewArray(int size, int min, int max) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(min, max + 1);
        }
        return arr;
    }

    public static void fillDescStat(DescriptiveStatistics desc, int quantity, int min, int max) {
        int[] arr = makeNewArray(quantity, min, max);
        for (int n : arr) {
            desc.addValue(n);
        }
    }
}