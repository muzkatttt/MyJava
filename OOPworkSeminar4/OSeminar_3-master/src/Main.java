import main.java.ru.gb.oseminar.data.Student;
import main.java.ru.gb.oseminar.data.StudentGroup;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentGroup students = new StudentGroup(List.of(new Student(3, "String firstName",
                "String secondName",
                "String patronymic", LocalDate.now()),new Student(2, "String firstName2",
                "String secondName",
                "String patronymic", LocalDate.now()),
                new Student(1 ,"a",
                "a",
                "a", LocalDate.now())));
     Iterator<Student> studentIterator = students.iterator();
     while (studentIterator.hasNext()){
         System.out.println(studentIterator.next().toString());
     }
        System.out.println("////////////////////////////////////");
     List<Student> list = students.getStudents().stream().sorted()
             .collect(Collectors.toList());
        System.out.println(list.toString());
    }
}
