package lesson3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TaskFileInputStream {
    // чтение из файла - десериализация
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // создание потока побайтового чтения из файла
        FileInputStream fileInputStream = new FileInputStream("ser");
        // создание потока побайтной загрузки из файла
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // загрузка самого объекта
        String s = (String) objectInputStream.readObject();
        System.out.println(s);
    }
}
