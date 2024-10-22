package faculty;

import faculty.model.Faculty;

public class App {
    public static void main(String[] args) {
        /*
        1.	Система Факультатив.
        Преподаватель объявляет запись на Курс.
        Студент записывается на Курс, обучается и по окончании
        Преподаватель выставляет Оценку, которая сохраняется в Архиве.
        Студентов, Преподавателей и Курсов при обучении может быть несколько.
         */

        Faculty faculty = new Faculty();
        faculty.startFaculty();

    }
}
