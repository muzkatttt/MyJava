package faculty.entity;

import faculty.entity.Course;
import faculty.entity.Human;

public class Instructor extends Human {

    private final String surname;
    private final String name;
    private final String patronymic;
    private Course course;

    public Instructor(String surname, String name, String patronymic, Course course) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.course = course;
    }

    public Instructor(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
