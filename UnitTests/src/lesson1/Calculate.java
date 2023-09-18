package lesson1;

import java.util.Scanner;

public class Calculate {
    public static double enterNums(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число >> ");
        String nameNumber = iScanner.nextLine();
        return Double.parseDouble(nameNumber);
    }

    public static char enterOperator(char args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Выберите математический оператор +, -, *, / >>\t");
        char operator = iScanner.next().charAt(0);
        return operator; // %c - вывод символа
    }

    public static double calculate(double a, double b, char operation) {
        double result = 0;
        switch (operation) {
            case '+': // сложение
                result = a + b;
                break;

            case '-': // вычитание
                result = a - b;
                break;

            case '*': // умножение
                result = a * b;
                break;

            case '/': // деление
                result = a / b;
                break;
            default:
                throw new ArithmeticException("Неизвестный оператор " + operation + " повторите ввод");
        }
        return result;
    }


}
