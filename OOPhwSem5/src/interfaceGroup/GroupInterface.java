package interfaceGroup;

import model.student.Student;

import java.util.List;

public interface GroupInterface {
    void create(List<Student> studentList, TeacherInterface teacher);

    void create(Student inputStudent);

}
