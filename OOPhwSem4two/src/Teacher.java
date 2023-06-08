import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends UserTeacher implements Comparable<Teacher>{

    private Long teacherId;
    private String teacher;
    private String firstName;
    private String secondName;
    private String patronymic;


    public Teacher(Long teacherId, String firstName, String secondName, String patronymic) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}

