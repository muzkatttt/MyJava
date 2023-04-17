/*
Реализовать простой калькулятор (введите первое число, введите второе число,
введите требуемую операцию, ответ)
*/

import java.util.Scanner;

public class hwTask4 {
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
                System.out.println("Ошибка ввода, повторите");
        }
        return result;
    }


    public static void main(String[] args) {
        double a = enterNums(args);
        double b = enterNums(args);
        char c = enterOperator((char) 0);
        double decide = calculate(a, b, c);
        System.out.printf("%.2f\n", decide);
    }
}
