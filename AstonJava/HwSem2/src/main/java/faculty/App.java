package faculty;

import faculty.entity.*;
import faculty.model.Faculty;

import java.util.List;

public class App {
    public static void main(String[] args){
        /*
        1.	Система Факультатив.
        Преподаватель объявляет запись на Курс.
        Студент записывается на Курс, обучается и по окончании
        Преподаватель выставляет Оценку, которая сохраняется в Архиве.
        Студентов, Преподавателей и Курсов при обучении может быть несколько.
         */

        Faculty faculty = new Faculty(
                new Course("Programming"),
                new Instructor("Ilya"));
        StudentsList studentsList = new StudentsList();

        System.out.printf("Курс по %s ведет %s \n",
                faculty.getCourse().getNameOfCourse(),
                faculty.getInstructor());

    }
}
