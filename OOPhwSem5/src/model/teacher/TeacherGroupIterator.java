package model.teacher;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {

    private int countTeachers;

    private List<Teacher> allTeachers;

    public TeacherGroupIterator(int countTeachers, List<Teacher> allTeachers) {
        this.countTeachers = countTeachers;
        this.allTeachers = allTeachers;
    }

    @Override
    public boolean hasNext() {
        return countTeachers < allTeachers.size();
    }

    @Override
    public Teacher next() {
        if(!hasNext()){
            throw new RuntimeException("Teachers");
        }
        return allTeachers.get(countTeachers++);
    }
}
