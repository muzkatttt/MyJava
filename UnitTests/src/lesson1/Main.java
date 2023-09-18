package lesson1;

public class Main {
    public static void main(String[] args) {
            double a = Calculate.enterNums(args);
            double b = Calculate.enterNums(args);
            char c = Calculate.enterOperator((char) 0);
            double decide = Calculate.calculate(a, b, c);
            System.out.printf("%.2f\n", decide);
    }

}