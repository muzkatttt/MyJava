package hwSem3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class WorkWithJson {

    // region Поля
    public static final String FILE_JSON = "student.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // endregion


    // region Конструкторы
    public WorkWithJson() {
    }
    // endregion


    // region Методы

    /**
     * сериализация объекта в json
     * @param student объект
     */
    public void serToJsonFile(Student student) {
        try {
            objectMapper.writeValue(new File(FILE_JSON), student);
            System.out.printf("Объект %s сериализован в json файл %s\n", student.getClass(), FILE_JSON);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации в " + e.getMessage());
        }
    }

    /**
     * десериализация объекта из json
     * @param fileName название файла
     */
    public void deSerFromJsonFile(String fileName) {
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
    }

    // endregion

}
