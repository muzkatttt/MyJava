import controller.Controller;
import model.StudyGroup;
import model.student.Student;
import model.student.StudentComporator;
import model.teacher.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        — Создать класс УчебнаяГруппа, содержащий в себе поля
        Преподаватель и список Студентов;
        — Создать класс УчебнаяГруппаСервис, в котором реализована функция
        (входные параметры - (Teacher, List<Student>))
        формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
        — Создать метод в Контроллере, в котором агрегируются функции
        получения списка студентов (их id) и преподавателя (его id) и
        формирования учебной группы, путём вызова метода из сервиса;
        — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.
        Формат сдачи: ссылка на гитхаб проект
         */

        Controller controller = new Controller();
        Teacher teacherT = new Teacher("James", "Gosling", 5);
        Student student1 = new Student("Patric", "Noton", 10001);
        Student student2 = new Student("Cris", "Yart", 10003);
        Student student3 = new Student("Ed", "Frank", 10009);
        Student student4 = new Student("Mike", "Sheridan", 10004);

        List<Student> listStudent = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        // через итератор вывод на печать списка студентов
        Iterator<Student> studentIterator = listStudent.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
        System.out.println();

        // распечатать группу преподаватель + студенты
        StudyGroup studyGroup = controller.createListGroup(listStudent, teacherT);
        System.out.println(studyGroup);

        // печать через контроллер
        System.out.println(controller.getStudents());
        System.out.println(controller.getTeacher());
    }
}