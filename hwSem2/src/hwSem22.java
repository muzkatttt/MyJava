import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class hwSem22 {
    public static void main(String[] args) {
        /*
        Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.
        Используйте StringBuilder для подготовки ответа
        Исходная json строка это просто String !!!
        Для работы используйте методы String, такие как replace, split, substring и т.д. по необходимости
        Создать метод, который запишет результат работы в файл.
        Обработайте исключения и запишите ошибки в лог файл.
        2. *Получить исходную json строку из файла, используя FileReader или Scanner
 */
        String myStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\": \"Физика\"}]";

        //System.out.println(myStr);
        changeString(myStr);
    }

    public static void changeString(String args) {
        StringBuilder stringBuilder = new StringBuilder();

        args = args.replace(":", ",")
                .replaceAll("[^A-Za-zА-Яа-я-0-9-,]", "")
                .replace("фамилия", "Студент")
                .replace("оценка", "получил")
                .replace("предмет", "по предмету");

        String[] myString = args.split(",");
        for (int i = 0; i < myString.length; i++) {
            if (myString[i].equals("Студент") && i != 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(myString[i] + " ");
        }
        //stringBuilder.replace(stringBuilder.length() - 1,stringBuilder.length() - 1, "" );
        System.out.println(stringBuilder.toString());
        saveToFile(stringBuilder.toString());
        //return myString;
    }

    public static void saveToFile(String str) { //
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("src/file.txt", true), "UTF-8"))) {
            writer.write(str);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            appendToFile(e);
        }
    }

    public static void appendToFile(Exception e) {
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("src/mistakes.txt"), "UTF-8"));
            PrintWriter pWriter = new PrintWriter(out, true);
            e.printStackTrace(pWriter);
            out.newLine();
        } catch (Exception ie) {
            throw new RuntimeException("Невозможно добавить файл", ie);
        }
    }
}

