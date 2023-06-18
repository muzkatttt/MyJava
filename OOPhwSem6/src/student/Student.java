package student;

import users.User;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student> {
    private int studentCourse;


    public Student(int studentCourse, String firstName, String secondName,
                   String patronymic, LocalDate dateOfBirth) {
        super();
        setFirstName(firstName);
        setSecondName(secondName);
        setPatronymic(patronymic);
        setDateOfBirth(dateOfBirth);
        setStudentCourse(studentCourse);
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }


    @Override
    public String toString() {
        return "Студент: " +
                "курс: " + getStudentCourse() + '\'' +
                ", имя: " + getFirstName() + '\'' +
                ", фамилия: " + getSecondName() + '\'' +
                ", отчество: " + getPatronymic() + '\'' +
                ", дата рождения: " + getDateOfBirth() + '\'' +
                ", id: " + getUserId() + '\'' +
                '.';
    }

    @Override
    public int compareTo(Student o) {
        return this.getSecondName().compareTo(o.getSecondName());
    }
}


