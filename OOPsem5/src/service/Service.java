package service;

import model.Student;
import model.Teacher;

import java.util.List;

public interface Service {
    public void create(List<Student> inputList, Teacher teacher);

    public void create(Student inputStudent);

    public void read();
}
