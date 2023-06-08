
public class UserTeacher {
    private String firstName;
    private String secondName;
    private String patronymic;
    private Long teacherId;

    public UserTeacher() {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Преподаватель: табельный №: " +
                teacherId +
                ", имя " + firstName + '\'' +
                ", фамилия " + secondName +
                ", отчество " + patronymic +
                '.';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserTeacher)) {
            return false;
        }

        UserTeacher userTeacher = (UserTeacher) o;

        if (getFirstName() != null ? !getFirstName().equals(userTeacher.getFirstName()) :
                userTeacher.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(userTeacher.getSecondName()) :
                userTeacher.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(userTeacher.getPatronymic()) :
                userTeacher.getPatronymic() != null) {
            return false;
        }
        return getTeacherId() != null ? getTeacherId().equals(userTeacher.getTeacherId()) :
                userTeacher.getTeacherId() == null;
    }
}
