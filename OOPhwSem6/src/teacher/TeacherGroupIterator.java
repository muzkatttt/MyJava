package teacher;

import interfaceUser.UserGroupInterface;
import users.UserGroup;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TeacherGroupIterator extends UserGroup implements Iterator<Teacher>, UserGroupInterface {

    private int id;
    private List<Teacher> teachers;

    public TeacherGroupIterator(TeacherGroup teacherGroup){
        this.teachers = teacherGroup.getTeachers();
        this.id = 0;
    }

    @Override
    public boolean hasNext() {
        return id < teachers.size();
    }

    @Override
    public void forEachRemaining(Consumer<? super Teacher> action) {
        Iterator.super.forEachRemaining(action);
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            throw new RuntimeException("Teachers");
        }
        return teachers.get(id++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
