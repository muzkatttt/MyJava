package controller;

import model.StudyGroup;
import model.student.Student;
import model.teacher.Teacher;
import service.Service;
import service.StudyGroupService;

import java.util.List;

public class Controller implements Service {
    /*
    Создать метод в Контроллере, в котором агрегируются функции
    получения списка студентов (их id) и преподавателя (его id) и
    формирования учебной группы, путём вызова метода из сервиса;
     */

    StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    @Override
    public StudyGroup createListGroup(List<Student> studentList, Teacher teacher) {
        StudyGroup studyGroup = null;
        if (studentList != null && teacher != null) {
            studyGroup = studyGroupService.createListGroup(studentList, teacher);
        } else {
            System.out.println("Ошибка при создании группы");
        }
        return studyGroup;
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public Teacher getTeacher() {
        return null;
    }
}
