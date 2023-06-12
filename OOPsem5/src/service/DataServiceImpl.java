package service;

import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements Service {
    static Integer idGenerator = 1;
    List<Student> studentList;
    Teacher teacher;
    Integer id;

    public DataServiceImpl() {
        this.studentList = new ArrayList<>();
        this.id = idGenerator++;
    }

    @Override
    public void create(List<Student> inputList, Teacher teacher) {
        this.studentList.addAll(inputList);
        this.teacher = teacher;
    }

    @Override
    public void create(Student inputStudent) {
        this.studentList.add(inputStudent);
    }

    @Override
    public void read() {
        System.out.println("group №" + this.id);
        System.out.println(teacher);
        for (Student s : studentList) {
            System.out.println("\t" + s);
        }
    }
}
