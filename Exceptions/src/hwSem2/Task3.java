package hwSem2;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws Exception {
        /*
        Дан следующий код, исправьте его там, где требуется
        (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
         */
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            //int[] abc = {1, 2, 3}; // для проверки добавлен элемент с индексом 2
            int[] abc = {1, 2};
            abc[3] = 9; // следующий индекс элемента = 2;
            System.out.println(Arrays.toString(abc));
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        // общие исключения "Throwable e" перенесла в самый конец после проверки частных ошибок
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        // throws FileNotFoundException - неподходящее исключение
        System.out.println(a + b);
    }
}
