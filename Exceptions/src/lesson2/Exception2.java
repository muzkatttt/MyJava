package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {
    public static void main(String[] args) {
        // ClassCastExceptions - неверное присвоение типов
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);

        // NumberFormatException - неверное преобразование строки в число
//        String number = "123ld";
//        int result = Integer.parseInt(number);
//        System.out.println(result);

        // использование try-catch
//        System.out.println("Начало");
//        try {
//            int а = 0;
//            int b = 42 / а;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Конец"); }


        /* Последовательность выполнения Exceptions
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            System.out.println(test.length());
//        } catch (Exception e) { // данный порядок блоков недостижим
            // сначала обрабатываются самые узкие исключения, потом самые общие
            // блок (Exception e) ставится в конце
//            System.out.println("Ошибка");
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        } catch (NullPointerException e) {
            System.out.println("Обращение к несуществующему объекту");
        }
        System.out.println(number);
    }

        Вариант 1  - обработка ошибок при работе FileReader
        FileReader test;
        try {
            FileReader test = new FileReader("test");
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */
        // вариант 2 - лучше добавлять блок finally
        FileReader test = null;
        try {
            test = new FileReader("/Users/ekaterinarodionova/Desktop/MyJava/Exceptions/src/lesson1/Hello.txt");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception");
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
        }
        System.out.println("finally finished");
    }
}

