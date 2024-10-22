package faculty.entity;


import java.util.ArrayList;
import java.util.List;

public class Instructor extends Human {
    private final String name;

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Метод, создающий новый курс
     * @param courseName название курса
     */
    public void createCourse(String courseName) {
        Course newCourse = new Course(courseName);
        List<Course> list = new ArrayList<>();
        list.add(newCourse);
        System.out.printf("Добавлен курс %s\n", courseName);
    }


    /**
     * Метод для выставления оценки студенту
     * @param student студент
     * @param course курс
     * @param result результат
     * @param archive архив, куда сохраняются оценки студентов
     */
    public void takeResultStudent(Student student, Course course, Result result, Archive archive) {
        archive.addResult(student, course, result.getResult());
        // проверка выполнения метода
//        System.out.printf("Выставлена оценка %s у студента %s по курсу %s",
//                result.getResult(), student.getName(), course.getNameOfCourse());
    }
}
