package faculty.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import faculty.entity.Archive;
import java.io.File;
import java.io.IOException;

public class WriteToJsonFile {

    public static final String FILE_JSON = "students.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public WriteToJsonFile() {
    }

    /**
     * запись объекта в json
     * @param archive объект
     */
    public void addToJsonFile(Archive archive) {
        try {
            objectMapper.writeValue(new File(FILE_JSON), archive);
            System.out.printf("Объект %s записан в json-файл %s\n", archive.getClass(), FILE_JSON);
        } catch (IOException e) {
            System.out.println("Ошибка записи в " + e.getMessage());
        }
    }
}
