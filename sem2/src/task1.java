
public class task1 {
    public static void main(String[] args) {
        String a = ex1("aaaabbbcddaa");
        System.out.println(a);
        // System.out.println(ex1("aaaabbbcddaa"); // можно использовать метод println без объявления переменной
    }

    public static String ex1(String s) {
        /*
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcddaa.
        Результат: a4b3cd2a2
         */
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 1; // начинаем с 1, т.к. начинаем сравнивать с 2-го символа
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) { // сравнение n-го символа с предыдущим (поэтому цикл начинается с 1)
                count++;
            } else {
                stringBuilder.append(arr[i - 1]);
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(arr[arr.length - 1]); // добавляем
        if (count > 1) {
            stringBuilder.append(count); // добавляем если количество подряд идущих элементов больше 1!
        }
        return stringBuilder.toString();
    }

}