package faculty.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Archive {
    public HashMap<String, ArrayList<String>> results;


    public Archive() {
        this.results = new HashMap<>();
    }

    /**
     * Метод добавляет результат студента в HashMap<String, ArrayList<String>> results
     * @param student студент
     * @param course курс
     * @param result результат
     */
    public void addResult(Student student, Course course, int result) {
        String key = student.getName() + " - " + course.getNameOfCourse();
        results.putIfAbsent(key, new ArrayList<String>());
        results.get(key).add(String.valueOf(result));
    }

    /**
     * Метод для вывода результата на консоль
     */
    public void printResult() {
        for (Map.Entry<String, ArrayList<String>> entry : results.entrySet()) {
            System.out.printf("%s выставлена оценка: %s.\n", entry.getKey(), entry.getValue());
        }
    }
}
