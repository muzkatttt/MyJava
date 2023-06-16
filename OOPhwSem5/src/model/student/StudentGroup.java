package model.student;


import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> groupStudents;


    private List<Student> groupStudents(){
        return groupStudents;
    }

    public StudentGroup(List<Student> groupStudents) {
        this.groupStudents = groupStudents;
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }

    public List<Student> getGroupStudents() {
        return groupStudents;
    }

    public void setGroupStudents(List<Student> groupStudents) {
        this.groupStudents = groupStudents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StudentGroup{");
        sb.append("groupStudents=").append(getGroupStudents());
        sb.append('}');
        return sb.toString();
    }
}
