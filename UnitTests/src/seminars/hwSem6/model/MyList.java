package seminars.hwSem6.model;

import java.util.Random;

public class MyList extends AbstractClass implements ListInterface {

    public MyList() {
    }

    @Override
    public void compareArray(double resultAverage1, double resultAverage2) {
        if(resultAverage1 == resultAverage2) {
            System.out.println("Средние значения массивов равны");
        } else if (resultAverage1 > resultAverage2) {
                System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }

    @Override
    public double averageArray(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        double resultAverage = Math.round(sum / array.length);
        System.out.println("\nСреднее значение списка = " + resultAverage + ".\n");
        return resultAverage;
    }

    @Override
    public int[] createArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt(3, 10));
            System.out.printf(array[i] + " ");
        }
        return array;
    }

}
