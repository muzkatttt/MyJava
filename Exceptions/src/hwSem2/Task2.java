package hwSem2;

public class Task2 {
    /*
    Если необходимо, исправьте данный код
    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     */
    public static void main(String[] args) {
        //добавляем масссив рамером минимум в 9 элементов
        int[] intArray = new int[] {0, 6, 4, 3, 1, 88, 12, 13, 99, 10};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
