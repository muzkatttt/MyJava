
import model.student.Student;
import model.teacher.Teacher;

import java.util.List;

public interface View {

    void createListGroup(List<Student> studentList, Teacher teacher);

    void getStudents();

    void getTeacher();
}
