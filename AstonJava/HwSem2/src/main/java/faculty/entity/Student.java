package faculty.entity;

import faculty.entity.Course;
import faculty.entity.Human;

import java.util.Date;

public class Student extends Human {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final Date dateOfBirth;
    private Course course;

    public Student(String surname, String name, String patronymic, Date dateOfBirth, Course course) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
    }

    public Student(String surname, String name, String patronymic, Date dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }


}
