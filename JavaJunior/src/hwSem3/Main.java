package hwSem3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Student student = Student.create("James Gosling", 38, 99.99);
        System.out.println(student);

        // сериализовать student
        try (FileOutputStream fileOut = new FileOutputStream("student.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(student);
            System.out.printf("Объект %s сериализован.\n", student.getClass().getName());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
