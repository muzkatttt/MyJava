package teacher;

import interfaceUser.UserInterface;
import users.User;

import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>, UserInterface {

    /*
    К классам, рассмотренным на семинаре добавлен класс Teacher, в котором применены принципы инкапсуляции
    (обращение к полям класса через get и set), наследование (класс Teacher наследует атрибуты класса User),
    о применении принципа полиморфизма указано в классе User.

    В классе Teacher реализован принцип единственной ответственности (Single Responsibility Principle), т.к. он
    наследуется от класса User, но имеет одно поле (teacherId).
    Принцип единственной ответственности реализован также в классах StudentGroup & TeacherGroup,
    которые наследуются от UserGroup.

    Принцип подстановки лисков можно проверить путем замены объектов наследниками, и если класс User заменить на
    Teacher или Student, то программа продолжит работать без изменения свойств.

    Принцип открытости/зактрытости реализован в классах User, Teacher, Student и др. путем создания getter & setter,
    при обращении к полям класса через эти методы соблюдается принцип закрытости сущностей для модификации,
    а создание классов-наследников (таких как Student & Teacher), позволяет соблюсти принцип открытости -
    то есть наши сущности открыты для дальнейших расширений.
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
