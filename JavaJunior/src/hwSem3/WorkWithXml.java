package hwSem3;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class WorkWithXml {

    // region Поля
    public static final String FILE_XML = "student.xml";

    private static final XmlMapper xmlMapper = new XmlMapper();
    Student student;

    // endregion


    // region Конструкторы
    public WorkWithXml() {
    }
    // endregion


    // region Методы

    /**
     * сериализация объекта в xml
     * @param student
     */
    public void serToXmlFile(Student student) {
        try {
            xmlMapper.writeValue(new File(FILE_XML), student);
            System.out.printf("Объект %s сериализован в xml файл %s\n", student.getClass(), FILE_XML);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации в " + e.getMessage());
        }
    }


    /**
     * десериализация объекта из xml
     * @param fileName название файла
     * @return объект
     */
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

    // endregion
}
