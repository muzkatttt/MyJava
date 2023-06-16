import controller.Controller;
import model.StudyGroup;
import model.student.Student;
import model.teacher.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
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
        Student student1 = new Student("Patric", "Noton");
        Student student2 = new Student("Cris", "Yart");
        Student student3 = new Student("Ed", "Frank");
        Student student4 = new Student("Mike", "Sheridan");

        List<Student> listStudent = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        StudyGroup studyGroup = controller.createListGroup(listStudent, teacherT);
        System.out.println(studyGroup);
    }
}