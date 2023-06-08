import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;
    private Student student;

    public TeacherGroup(List<Teacher> teachers){
        this.teachers = teachers;
        this.student = student;
    }

    public TeacherGroup(int id, String name, String secondname, String patronim) {
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Teacher> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Teacher> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "Группа преподавателя" +
                "преподаватель: " + teachers +
                ", студент: " + student +
                '.';
    }
}
