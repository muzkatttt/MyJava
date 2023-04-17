import java.util.Scanner;

/*
Вычислить n! (произведение чисел от 1 до n)
 */
public class hwTask2 {
    public static String enterNumFromUser(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: >> \n");
        return iScanner.nextLine();
    }

    public static void main(String[] args) {
        int factorial = 1;
        String myString = enterNumFromUser(args);
        int num = Integer.parseInt(myString);
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
