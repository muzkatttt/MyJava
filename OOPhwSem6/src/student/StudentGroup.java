package student;

import interfaceUser.UserInterface;
import teacher.Teacher;
import users.UserGroup;

import java.util.List;

public class StudentGroup extends UserGroup implements Iterable<Student>, UserInterface {
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(List<Student> students) {
        setStudents(students);
        setTeacher(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Группа" +
                "студент" + getStudents() +
                ", преподаватель" + getTeacher() +
                '.';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
