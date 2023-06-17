import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>{

    private int teacherId;

    public Teacher(Integer teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
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
                ", teacherId " + getTeacherId();
    }
}
