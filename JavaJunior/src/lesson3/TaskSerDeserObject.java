package lesson3;

import java.io.*;
import java.util.ArrayList;

public class TaskSerDeserObject {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Character.getName(i)); // добавить символ по его порядковому номеру
        }
        serialObject(list, "ser");
    }

    // сериализация объекта
    public static void serialObject(Object o, String file) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(o);
        objectOutputStream.close();
    }

    // десериализаця объекта
    public static Object deSerialObject(String file) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();

    }
}
