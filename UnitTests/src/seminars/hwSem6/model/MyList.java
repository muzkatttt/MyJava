package seminars.hwSem6.model;

import java.util.Random;

public class MyList extends AbstractClass implements ListInterface {
    public int[] array;
    double resultAverage;

    public MyList() {
        this.array = array;
        this.resultAverage = resultAverage;
    }

    public MyList(int[] array) {
        this.array = array;
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
        double resultAverage = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        resultAverage = Math.round(sum / array.length);
        System.out.println("Среднее значение списка = " + resultAverage + ".");
        return resultAverage;
    }

    @Override
    public int[] createArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt(3, 10));
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
        return array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public double getResultAverage() {
        return resultAverage;
    }

    public void setResultAverage(double resultAverage) {
        this.resultAverage = resultAverage;
    }

}
