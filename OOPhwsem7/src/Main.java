import controller.Controller;
import controller.Controller2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // для первой части
//        System.out.println("Введите далее: >>\n");
//        Controller controller = new Controller();
//        double a = controller.inputAToFirst();
//        double b = controller.inputBbToFirst();
//        double c = controller.inputCToSecond();
//        double d = controller.inputDToSecond();
//        System.out.println("Выберите действие (+, -, *, / ): \n");
//        Scanner scannerOperator = new Scanner(System.in);
//        String operator = scannerOperator.nextLine();
//
//        switch (operator) {
//            case "+" -> controller.addition(a, b, c, d);
//            case "-" -> controller.subtraction(a, b, c, d);
//            case "*" -> controller.multiplication(a,b,c,d);
//            case "/" -> controller.division(a,b,c,d);
//            default -> {
//                System.out.println("Ввод только для символов");
//            }
//        }
        System.out.println("Введите далее >>\n");
        Controller2 cont2 = new Controller2();
        double a = cont2.inputAToFirst();
        double b = cont2.inputBbToFirst();
        double c = cont2.inputCToSecond();
        double d = cont2.inputDToSecond();
        System.out.println("Выберите действие (+, -, *, /): \n");
        Scanner scanOper = new Scanner(System.in);
        String operator = scanOper.nextLine();

        switch(operator){
            case "+" -> cont2.addition(a, b, c, d);
            case "-" -> cont2.subtraction(a, b, c, d);
            case "*" -> cont2.multiplication(a, b, c, d);
            case "/" -> cont2.division(a, b, c, d);
            default -> System.out.println("Введите символы");
        }
    }



//    public String scannerFromUser() {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Введите число: >> \n");
//        System.out.println("Введите число: >> \n");
//        return iScanner.nextLine();
//    }

}

