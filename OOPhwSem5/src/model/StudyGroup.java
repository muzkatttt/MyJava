package model;
import model.abstractClass.Group;
import model.abstractClass.Users;
import model.student.Student;
import model.student.StudentGroup;
import model.teacher.Teacher;

import java.util.List;

public class StudyGroup extends Group<Student> {
    /*
    — Создать класс УчебнаяГруппа, содержащий в себе поля
    Преподаватель и список Студентов;
     */
    private Teacher teacher;

    public StudyGroup(int numberOfGroup, List<Student> users, Teacher teacher) {
        super(numberOfGroup, users);
        this.teacher = teacher;
    }

    public StudyGroup(int numberOfGroup, Teacher teacher) {
        super(numberOfGroup);
        this.teacher = teacher;
    }

    @Override
    protected void addToGroup() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup{" + getTeacher() + "\n"
                + ", group of students " + getNumberOfGroup() + "\n"
                + ", students" + getUsers() + "}.";

    }
}
