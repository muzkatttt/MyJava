package hwSem3;

import java.io.*;

public class WorkWithSer {

    // region Поля
    public static final String FILE_TXT = "student.txt";

    // endregion


    // region Конструкторы
    public WorkWithSer() {
    }

    // endregion


    // region Методы
    /**
     * сериализация student в текстовый файл
     * @param student
     */
    public void serToTxtFile(Student student) {

        try (FileOutputStream fileOut = new FileOutputStream(FILE_TXT);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.printf("Объект %s сериализован в текстовый файл %s\n", student.getName(), FILE_TXT);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * десериализация student из текстового файла
      */
    public void deSerFromTxtFile(Student student) {
        try (FileInputStream fileIn = new FileInputStream(FILE_TXT);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            in.readObject();
            System.out.println("Объект Student десериализован из текстового файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("ФИО студента: %s, возраст: %s, средний балл (GPA): %s\n",
                student.getName(), student.getAge(), student.getGpa());
    }

    // endregion
}
