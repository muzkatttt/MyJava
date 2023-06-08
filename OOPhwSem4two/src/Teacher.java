import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;
    public String teacher;
    private String firstName;
    private String secondName;
    private String patronymic;


    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }


    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.setDateOfBirth(dateOfBirth);
    }


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

        @Override
        public String toString() {
            String dateOfBirth;
            String s = "Преподаватель: имя " + firstName + ", фамилия: " + secondName +
                    ", отчество " + patronymic + ", дата рождения " + dateOfBirth +
                    '.';
            return s;
        }

        private String getTeacher() {
            return teacher;
        }

        @Override
        public int compareTo(Student o) {
            return this.studentId.compareTo(o.studentId);
        }
    }
}

