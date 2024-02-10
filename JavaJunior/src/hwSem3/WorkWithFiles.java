package hwSem3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class WorkWithFiles implements Serializable {
    public static final String FILE_JSON = "student.json";
    public static final String FILE_XML = "student.xml";
    public static final String FILE_TXT = "student.txt";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final XmlMapper xmlMapper = new XmlMapper();
    Student student;

    //сериализовать student в текстовый файл
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

    // десериализовать student из текстового файла
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

    // сериализовать student в json
    public void serToJsonFile(Student student) {
        try {
            objectMapper.writeValue(new File(FILE_JSON), student);
            System.out.printf("Объект %s сериализован в json файл %s\n", student.getClass(), FILE_JSON);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации в " + e.getMessage());
        }
    }

    // сериализовать student в xml
    public void serToXmlFile(Student student) {
        try {
            xmlMapper.writeValue(new File(FILE_XML), student);
            System.out.printf("Объект %s сериализован в xml файл %s\n", student.getClass(), FILE_XML);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации в " + e.getMessage());
        }
    }

    // десериализовать student из json
    public Student deSerFromJsonFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            try {

                Student studentJson = objectMapper.readValue(file, Student.class);
                System.out.printf("ФИО студента: %s, возраст: %s, средний балл (GPA): %s\n",
                        studentJson.getName(), studentJson.getAge(), studentJson.getGpa());

            } catch (IOException e) {
                System.out.printf("Ошибка десериализации из %s", e.getMessage());
            }
            }
            return student;
        }

    // десериализовать student из xml
    public Student deSerFromXmlFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            try {

                Student studentXml = xmlMapper.readValue(file, Student.class);
                System.out.printf("ФИО студента: %s, возраст: %s, средний балл (GPA): %s\n",
                        studentXml.getName(), studentXml.getAge(), studentXml.getGpa());

            } catch (IOException e) {
                System.out.printf("Ошибка десериализации из %s", e.getMessage());
            }
        }
        return student;
    }

}
