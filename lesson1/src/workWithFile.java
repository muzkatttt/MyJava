import java.io.FileWriter;
import java.io.IOException;

// Работа с файлами
//Создание и запись\ дозапись
public class workWithFile {
    public static void main(String[] args) {
        // FileWriter fw - экземпляр fw класса FileWriter, который мы должны индентифицировать с помощью
        // конструктора, где в качестве конструктора передается имя файла и аргумент true/false в зависимости от того,
        // нужно или нет записывать в файл данные
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) { // c помощью IOException ex можем посмотреть,
            // какая ошибка возникает при обработке файла
            System.out.println(ex.getMessage());
        }
        // попробовала работать с json
        try (FileWriter fw = new FileWriter("file.json", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
