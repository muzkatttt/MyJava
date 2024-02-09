package hwSem3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class Main {

    public static final String FILE_JSON = "student.json";
    public static final String FILE_XML = "student.xml";
    public static final String FILE_TXT = "student.txt";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final XmlMapper xmlMapper = new XmlMapper();


    public static void main(String[] args) {
        Student student = Student.create("James Gosling", 38, 99.99);

        // сериализовать student в текстовый файл
        try (FileOutputStream fileOut = new FileOutputStream(FILE_TXT);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.printf("Объект %s сериализован.\n", student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))) {
            Student student1 = (Student) ois.readObject();
            System.out.println("из текстового файла " + student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

//        File txtFile = new File(FILE_TXT);
//        saveToFile(FILE_TXT, student);
//        System.out.printf("Объект сохранен в файл %s \n", txtFile);
        deSerialization(FILE_TXT, student);
        System.out.printf("ФИО %s, возраст %s\n", student.getName(), student.getAge());


        File jsonFile = new File(FILE_JSON);
        serialization(FILE_JSON, student);
        System.out.printf("Объект сохранен в файл %s \n", jsonFile);
        deSerialization(FILE_JSON, student);
        System.out.printf("ФИО %s, возраст %s\n", student.getName(), student.getName());


        File xmlFile = new File(FILE_XML);
        serialization(FILE_XML, student);
        System.out.printf("Файл %s сохранен\n", xmlFile);
        deSerialization(FILE_XML, student);
        System.out.printf("ФИО %s, возраст %s\n", student.getName(), student.getAge());

    }

    public static void serialization(String fileName, Student student) {
        try {
            if (fileName.endsWith(".json")) {
                objectMapper.writeValue(new File(fileName), student);
            } else if (fileName.endsWith(".xml")) {
                xmlMapper.writeValue(new File(fileName), student);
            }
        } catch (IOException e) {
            System.out.println("Ошибка сериализации в " + e.getMessage()); // e.printStackTrace();
        }
    }

    public static Student deSerialization (String fileName, Student student) {;
        File file = new File(fileName);
        if (file.exists()) {
            try {
                if (fileName.endsWith(".json")) {
                   objectMapper.readValue(new File(FILE_JSON), Student.class);
                    return student;
                } else if (fileName.endsWith(".xml")) {
                    xmlMapper.readValue(new File(FILE_XML), Student.class);
                    return student;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return student;
    }
}
