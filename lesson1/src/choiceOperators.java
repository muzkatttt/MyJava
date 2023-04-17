import java.util.Scanner;

public class choiceOperators {
    public static void main(String[] args) {

        // операторы выбора
        int mounth = 12;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            case 2:
                text = "Winter";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        //iScanner.close();
/*
        // конструкцию switch case можно записывать в таком виде:
        switch (a) { // если один из кейсов будет выполнен (1, 2, 3 ...), то отработает команда вывода на печать
            case 1:
            case 2:
            case 3:
                System.out.println("a");
                break;
            case 10: // если будет выполнен кейс 10, то выведется на экран b
                System.out.println('b');
                break;
            default:
                break;
        }
        */
    }
}
