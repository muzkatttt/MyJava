package sem3.task4;

public class Main {
    /*
    Задание No4
    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
     */
    final static int selectedSize = 4;
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "3", "2", "4"},
                {"1", "3", "2", "4"},
                {"1", "3", "2", "4"},
                {"1", "3", "2", "4"},
                /*{"1", "3", "2", "4"}*/};

        try {
            System.out.println(arraySum(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int arraySum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != selectedSize || arr[0].length != selectedSize)
            throw new MyArraySizeException("actual size: " + arr.length + " x " + arr[0].length +
                        ". Expected " + selectedSize + " x " + selectedSize);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!arr[i][j].matches("\\d"))
                    throw new MyArrayDataException("index [" + i + "][" + j + "] can't format to digit!");
                else sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum;
    }
}


