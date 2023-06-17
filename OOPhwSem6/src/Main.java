import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Проект work6: продемонстрировать применение принципов, усвоенных на семинаре.
        Нужно в проекте прокомментировать участки кода, которые рефакторим,
        какой принцип применяем и почему.
         */

        //taskFromSem();

        List<Teacher> listT = new ArrayList<>();
        listT.add(new Teacher(10001,
                "Василиса",
                "Премудрая",
                "Ивановна",
                LocalDate.of(1970, 10, 11)));
        listT.add(new Teacher(10005,
                "Белоснежка",
                "Семигномова",
                "Петровна",
                LocalDate.of(1974, 12, 24)));
        listT.add(new Teacher(10003,
                "Забава",
                "Алексеева",
                "Царевна",
                LocalDate.of(1972, 3, 23)));

        Iterator<Teacher> teacherIterator = listT.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next().toString());
        }

        //System.out.println(listT);
        // sort не имеет возвращаемого значения и модифицирует весь список
        TeacherGroup teacherGroup = new TeacherGroup(listT);
        teacherGroup.getTeachers().sort(new TeacherComparator());
        System.out.println(teacherGroup);
    }

    private static void taskFromSem() {
        StudentGroup students = new StudentGroup(List.of(new Student(3, "Добрыня",
                        "Красилов", "Никитич", LocalDate.now()),
                new Student(2, "Алеша", "Кузнецов", "Попович", LocalDate.now()),
                new Student(1, "Кощей", "Бессмертный", "Кощеевич", LocalDate.now()),
                new Student(4, "Илья", "Муромец", "Иванович", LocalDate.now())));


        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }

        List<Student> list = students.getStudents().stream().sorted() // stream используем -> если comparable
                .collect(Collectors.toList());
        System.out.println(list.toString());
    }
}
