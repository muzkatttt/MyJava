package service;

import model.StudyGroup;
import model.student.Student;
import model.teacher.Teacher;
import java.util.List;

public interface Service {

   StudyGroup createListGroup(List<Student> studentList, Teacher teacher);

   List<Student> getStudents();

   Teacher getTeacher();
}
