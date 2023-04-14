/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

public class Task4 {
    public static void main(String[] args) {
        String sourceString = "Добро пожаловать на курс по Java";
        String result = getResultString(sourceString);
        System.out.println(sourceString);
        System.out.println(result);
    }

    static String getResultString(String source) {
        String result = "";
        String[] tempArray = source.split(" ");
        for (int i = tempArray.length - 1; i >= 0; i--) {
            result += tempArray[i] + " ";
        }
        result.strip();

        return result;
    }

}
