package sem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {
    /*
    Задание No1
    Создайте метод doSomething(), который может быть источником одного из типов checked
    exceptions (тело самого метода прописывать не обязательно).
    Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
     */
    public static void main(String[] args) {
            try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException {
        // чтобы поймать Exception - указать имя файла "names4.txt"
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of("names.txt"));
    }
}
