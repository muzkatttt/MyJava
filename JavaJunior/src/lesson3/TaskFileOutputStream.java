package lesson3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TaskFileOutputStream {
    // запись в файл
    public static void main(String[] args) throws IOException {
        String str = "Всем привет!";
        // создание потока для записи в файл
        FileOutputStream fileOutputStream = new FileOutputStream("ser");
        // содание потока для записи объекта файла
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // запись объекта
        objectOutputStream.writeObject(str);
        // закрытие потока
        objectOutputStream.close();
    }
}
