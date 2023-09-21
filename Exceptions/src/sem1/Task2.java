package sem1;

public class Task2 {
    /* Задача 2
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.
    При этом накладываем на метод 2 ограничения: метод может работать только
    с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке
    может лежать только значение 0 или 1. Если нарушается одно из условий,
    метод должен бросить RuntimeException с сообщением об ошибке.
     */

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 0, 0, 1}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 0, 1, 0}};
        if (!isSquare(arr)) throw new RuntimeException("is not a square");
        System.out.println("Array sum is " + arrSum(arr));
    }

    public static int arrSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) throw new RuntimeException("No valid value");
                else sum += arr[i][j];
            }
        }
        return sum;
    }

    public static boolean isSquare(int[][] arr) {
        return arr.length == arr[0].length;
    }
}
