import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите далее: >>\n");
        Controller controller = new Controller();
        double a = controller.inputAToFirst();
        double b = controller.inputBbToFirst();
        double c = controller.inputCToSecond();
        double d = controller.inputDToSecond();
        System.out.println("Выберите действие (+, -, *, / ): \n");
        Scanner scannerOperator = new Scanner(System.in);
        String operator = scannerOperator.nextLine();

        switch (operator) {
            case "+" -> controller.addition(a, b, c, d);
            case "-" -> controller.subtraction(a, b, c, d);
            case "*" -> controller.multiplication(a,b,c,d);
            case "/" -> controller.division(a,b,c,d);
            default -> {
                System.out.println("Ввод только для символов");
            }
        }
    }

//    public String scannerFromUser() {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Введите число: >> \n");
//        System.out.println("Введите число: >> \n");
//        return iScanner.nextLine();
//    }

}

