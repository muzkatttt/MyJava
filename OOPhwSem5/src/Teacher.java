import model.abstractClass.Users;

public class Teacher extends Users {

    private int teacherID;

    private Teacher teacher;

    public Teacher(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + getTeacherID() +
                ", teacher=" + getTeacher() +
                "} " + super.toString();
    }
}