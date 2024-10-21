package faculty.model;

import faculty.entity.Course;
import faculty.entity.Instructor;
import faculty.entity.Student;
import faculty.entity.StudentsList;

import java.util.List;

public class Faculty {
    private Course course;
    private Instructor instructor;
    private StudentsList studentsList;

    public Faculty(Course course, Instructor instructor, StudentsList studentsList) {
        this.course = course;
        this.instructor = instructor;
        this.studentsList = studentsList;
    }

    public Course getCourse() {
        return course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public StudentsList getStudentsList() {
        return studentsList;
    }
}
