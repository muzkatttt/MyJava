package teacher;

import interfaceUser.UserInterface;
import users.User;

import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>, UserInterface {

    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super();
        setFirstName(firstName);
        setSecondName(secondName);
        setPatronymic(patronymic);
        setDateOfBirth(dateOfBirth);
        setTeacherId(teacherId);
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return getTeacherId().compareTo(o.teacherId);
    }

    @Override
    public String toString() {
        return "Преподаватель " +
                "фамилия " + getSecondName() +
                ", имя " + getFirstName() +
                ", отчество " + getPatronymic() +
                ", teacherId " + getTeacherId() + ".";
    }
}
