package faculty.model;

import faculty.entity.*;

import java.util.ArrayList;

public class Faculty {
    public Faculty() {
    }

    /**
     * Метод, запускающий работу факультета
     */
    public void startFaculty(){
        Instructor instructor = new Instructor("Ilya");
        Course course = new Course("Programming");
        Archive archive = new Archive();
        WriteToJsonFile writeToJsonFile = new WriteToJsonFile();

        // Преподаватель создаёт курс
        instructor.createCourse("Programming");

        // Добавляем студентов
        Student student1 = new Student("Karamel'ka");
        Student student2 = new Student("Barny");

        // Записываем студентов на курс
        course.addToTheCourse(student1, new ArrayList<>());
        course.addToTheCourse(student2, new ArrayList<>());

        // Преподаватель выставляет оценки
        instructor.takeResultStudent(student1, course, new Result(5), archive);
        System.out.printf("Преподаватель %s выставил оценки в журнал.\n", instructor.getName());
        instructor.takeResultStudent(student2, course, new Result(4), archive);

        // Выводим архив оценок
        archive.printResult();

        // Запись в json-файл
        writeToJsonFile.addToJsonFile(archive);
    }
}
