package teacher;

import interfaceUser.UserInterface;
import users.User;

import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>, UserInterface {

 /*
 К классам, рассмотренным на семинаре добавлен класс Teacher, в котором применены принципы инкапсуляции
 (обращение к полям класса через get и set), наследование (класс Teacher наследует атрибуты класса User),
 полиморфизм


  */
    private int teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, int teacherId) {
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
