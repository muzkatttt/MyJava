/* Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */

import java.util.Scanner;

public class hwTask1 {
    public static String enterNums(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: >> \n");
        return iScanner.nextLine();
    }

    public static void main(String[] args) {
        int result = 0;
        String n = enterNums(args);
        int number = Integer.parseInt(n);
        for (int i = 1; i <= number; i++) {
            result = (number * (number + 1)) / 2;
        }
        System.out.println(result);
    }
}

