package sem3.task1;

import java.io.*;

public class Program {

    /**
     * Задача 1
     * ========
     * <p>
     * Создайте класс UserData с полями String name, int age, transient String password.
     * Поле password должно быть отмечено ключевым словом transient.
     * Реализуйте интерфейс Serializable в вашем классе.
     * В методе main создайте экземпляр класса UserData и инициализируйте его данными.
     * Сериализуйте этот объект в файл, используя ObjectOutputStream в сочетании с FileOutputStream
     * <p>
     * Задача 2
     * ========
     * <p>
     * Десериализуйте объект из ранее созданного файла обратно в объект Java,
     * используя ObjectInputStream в сочетании с FileInputStream.
     * Выведите данные десериализованного объекта UserData.
     * Сравните данные до сериализации и после десериализации, особенно обратите внимание на поле,
     * помеченное как transient.
     * Обсудите, почему это поле не было сохранено после десериализации.
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Задача 1
        // сериализация
        UserData user = new UserData("Станислав", 37, "secret");

        System.out.println("Имя: " + user.getName());
        System.out.println("Возраст: " + user.getAge());
        System.out.println("Пароль: " + user.getPassword());
        System.out.println();


        try (FileOutputStream fileOut = new FileOutputStream("userdata.bin");
             ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(user);
            System.out.println("Объект UserData сериализован.");
        }

        // десериализация
        try (FileInputStream fileIn = new FileInputStream("userdata.bin");
             ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            user = (UserData)in.readObject();
            System.out.println("Объект UserData десериализован.");
        }

        System.out.println("Имя: " + user.getName());
        System.out.println("Возраст: " + user.getAge());
        System.out.println("Пароль (должен быть null, так как transient): " + user.getPassword());

    }
}
