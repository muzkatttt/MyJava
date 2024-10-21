package faculty.entity;

import java.util.List;

public class StudentsList {

    private List<Student> studentList;


    public StudentsList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentsList() {
    }

    public List<Student> studentAddToList(Student student){
        studentList.add(student);
        return studentList;
    }

}
