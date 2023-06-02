import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Написать калькулятор в ООП стиле
        (инкапсуляция, наследование, полиморфизм) */

        Operations oper = new Operations();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nВведите первое число\n%s", "->");
        Double a = scanner.nextDouble();
        System.out.printf("\nВведите второе число\n%s", "->");
        Double b = scanner.nextDouble();
        System.out.printf("\nВведите математическую операцию (+, -, *, /)\n%s", "->");
        char ch = scanner.next().charAt(0);
        System.out.printf("Результат = %f\n", oper.getResult(a, b, ch));
        System.out.println(oper);
    }
}