import java.time.LocalDate;
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

        TeacherGroup teachers1 = new TeacherGroup(1, "Василиса", "Премудрая", "Васильевна");
        TeacherGroup teachers2 = new TeacherGroup(2, "Мальвина", "Всезнающая", "Карловна");
        TeacherGroup teacher3 = new TeacherGroup(3, "Юрий", "Гагарин", "Алексеевич");

        Iterator<Teacher> teacherIterator = teachers.iterator();
        while(teacherIterator.hasNext()){
            System.out.println(teacherIterator.next().toString());
        }


    }
}
