/*
 Задано уравнение вида q + w = e, где q, w, e >= 0.
 Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
 Требуется восстановить выражение до верного равенства.
 Предложить хотя бы одно решение или сообщить, что его нет.
 */

import java.lang.NumberFormatException;
import java.lang.Integer;
public class hwTask5 {

    public static int checkingUserInput(String sequence) {
        String[] s = sequence.split("=");
        int onePart = Integer.parseInt(s[0].trim()); // метод .trim удаляет пробелы до и после
        int twoPart = Integer.parseInt((s[1].trim()));
        return onePart + twoPart;
    }

    public static void main(String[] args) {
        String x = "2? + ?5 = 69";
        String h = findSolution(args);
    }

    public static String findSolution(String[] args) {

        String unknownExpression = "2? + ?5 = 69";
        int count = 0;
        String findChar;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    findChar = unknownExpression.replace("?", "" + i).replace("?",
                            "" + j).replace("?", "" + k);
                    if (checkingUserInput(unknownExpression) == 69) {
                        count += 1;
                    }
                    System.out.println(findChar);
                }
            }
        }

        if (count == 0) {
            System.out.println(("Введенное уравнение не имеет решения"));
        }

        return unknownExpression;
    }

}


