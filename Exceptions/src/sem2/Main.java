package sem2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static String path = "names.txt";
    /*
    Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4
    Реализуйте метод, который считывает данные из файла и сохраняет
    в двумерный массив (либо HashMap, если студенты с ним знакомы).
    В отдельном методе нужно будет пройти по структуре данных,
    если сохранено значение ?, заменить его на соответствующее число.
    Если на каком-то месте встречается символ, отличный от числа или ?,
    бросить подходящее исключение.
    Записать в тот же файл данные с замененными символами ?.
     */
    public static void main(String[] args) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Анна=4\n" +
                    "Елена=5\n" +
                    "Марина=6\n" +
                    "Владимир=?\n" +
                    "Константин=?\n" +
                    "Иван=4");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("что-то пошло не так ;(");
        }
        HashMap<String, Integer> st = readNames(path);
        System.out.println(st);

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (Map.Entry<String, Integer> entry : st.entrySet()) {
                fileWriter.write(entry.getKey() + "=" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("сломалось...");
        }
    }

    public static HashMap<String, Integer> readNames(String path) {
        HashMap<String, Integer> list = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String temp = "";
            while ((temp = bufferedReader.readLine()) != null) {
                //temp = bufferedReader.readLine(); -
                temp.split("=");
                //list.put(temp.split("=")[0], temp.split("=")[1]);
                String[] arr = temp.split("=");
                if (arr[1].equals("?")) {
                    list.put(arr[0], arr[0].length());
                } else {
                    list.put(arr[0], Integer.parseInt(arr[1]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}