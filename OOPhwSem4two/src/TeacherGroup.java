import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public Iterator<Teacher> iterator() { // чтобы итератор работал, необходимо вернуть новый экземпляр
        // класса TeacherGroupIterator с пометкой this
        return new TeacherGroupIterator(this);
    }

    @Override
    public Spliterator<Teacher> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + getTeachers() +
                '}';
    }
}

