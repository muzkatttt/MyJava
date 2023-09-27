package sem3.task3;

import sem3.task4.MyArrayDataException;
import sem3.task4.MyArraySizeException;

import static sem3.task4.Main.arraySum;

public class Main {
    /*
    Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
    Создайте класс исключений, которое будет возникать при обращении к пустому элементу
    в массиве ссылочного типа. Исключение должно отображать понятное для пользователя
    сообщение об ошибке.
    Создайте класс исключения, которое будет возникать при попытке открыть
    несуществующий файл.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.

     */
    final static int selectedSize = 4;

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "3", "2", "4"},
                {"1", "3", "2", "4"},
                {"1", "3", null, "4"},
                {"1", null, "2", "4"}};

        try {
            System.out.println(arraySum(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            throw new RuntimeException(e);

        }

//    public static int arraySum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
//        if (arr.length != selectedSize || arr[0].length != selectedSize)
//            throw new MyArraySizeException("actual size: " + arr.length + " x " + arr[0].length +
//                    ". Expected " + selectedSize + " x " + selectedSize);
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (!arr[i][j].matches("\\d"))
//                    throw new MyArrayDataException("index [" + i + "][" + j + "] can't format to digit!");
//                else sum += Integer.parseInt(arr[i][j]);
//            }
//        }
//        return sum;
//    }

    }
}
