import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;
    private Teacher teacher;
    private int id;

    public TeacherGroup(List<Teacher> teachers){
        this.teachers = teachers;
        this.teacher = teacher;
    }

    public TeacherGroup(int id, String name, String secondname, String patronim) {
        this.id = id;

    }

    public List<Teacher> getTeachers(){
        return teachers;
    }


    @Override
    public Iterator<Teacher> iterator() {
        return null;
    }

    @Override
    public Spliterator<Teacher> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "Группа преподавателя" +
                "преподаватель: " + teachers +
                ", Id: " + id + '.';
    }
}
