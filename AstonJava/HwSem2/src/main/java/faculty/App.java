package faculty;

import faculty.entity.Course;
import faculty.entity.Instructor;
import faculty.entity.Student;
import faculty.entity.StudentsList;
import faculty.model.Faculty;

import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        1.	Система Факультатив.
        Преподаватель объявляет запись на Курс.
        Студент записывается на Курс, обучается и по окончании
        Преподаватель выставляет Оценку, которая сохраняется в Архиве.
        Студентов, Преподавателей и Курсов при обучении может быть несколько.
         */

        Faculty faculty = new Faculty(
                Course.HISTORY,
                new Instructor("Ilya", Course.HISTORY),
                new StudentsList(List.of(
                    new Student("Kate"),
                    new Student("Den")
                )
        ));

        System.out.printf("На курс по %d записаны студенты %d к преподавателю %d",
                faculty.getCourse(), faculty.getStudentsList(), faculty.getInstructor());
    }
}
