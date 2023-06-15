package model.student;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int count;
    private List<Student> groupStudents;

    public StudentGroupIterator(StudentGroup studentsGroup) {
        this.count = count;
        this.groupStudents = studentsGroup.getGroupStudents();
    }

    @Override
    public boolean hasNext() {
        return count < groupStudents.size();
    }

    @Override
    public Student next() {
        if(!hasNext()){
            throw new RuntimeException("Students");
        }
        return groupStudents.get(count++);
    }
}
