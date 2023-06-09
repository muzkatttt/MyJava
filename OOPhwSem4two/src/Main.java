import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        Модифицировать учительский класс и связанные с ним, добавив типизацию
        (Добавить iterator + comparator + teacherGroup)
         */

        StudentGroup students = new StudentGroup(List.of(new Student(3, "Добрыня",
                        "Красилов", "Никитич", LocalDate.now()),
                new Student(2, "Алеша", "Кузнецов", "Попович", LocalDate.now()),
                new Student(1, "Кощей", "Бессмертный", "Кощеевич", LocalDate.now()),
                new Student(4, "Илья", "Муромец", "Иванович", LocalDate.now())));


        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }

        List<Student> list = students.getStudents().stream().sorted()
                .collect(Collectors.toList());
        System.out.println(list.toString());


        TeacherGroup teachers = new TeacherGroup(List.of(new Teacher(10001L, "Василиса",
                        "Максимова", "Ивановна"),
                new Teacher(10002L, "Мальвина", "Денисова", "Петровна"),
                new Teacher(10003L, "Забава", "Попова", "Царевна")));


        List<Teacher> list3 = new ArrayList<>();
        Iterator<Teacher> iterator = list3.iterator();
        Teacher a;
        while (iterator.hasNext()) {
            a = iterator.next();
        }


//        List<Teacher> list2 = teachers.getTeachers().stream().sorted().collect(Collectors.toList());
       System.out.println(list3);

    }
}
