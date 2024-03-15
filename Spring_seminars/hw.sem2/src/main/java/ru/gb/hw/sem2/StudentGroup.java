package sem2;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentGroup {

    private ArrayList<Student> list;

    public StudentGroup() {
        list = new ArrayList<>();
        list.add(new Student("Kasimova Liubov`", "Developers"));
        list.add(new Student("Petrov Andrey", "Developers"));
        list.add(new Student("Ivanov Denis", "Developers"));
        list.add(new Student("Krasnova Evgenya", "Developers"));
        list.add(new Student("Sharikov Petr", "Developers"));
        list.add(new Student("Abramova Arina", "Designers"));
        list.add(new Student("Yakimov Yaroslav", "Designers"));
        list.add(new Student("Chaikina Galina", "Designers"));
        list.add(new Student("Suhova Aleksandra", "Designers"));

    }

    public ArrayList<Student> getAll(){
        List.copyOf(list);
        return list;
    }

    public Student getByName(String studentName){
        return list.stream()
                .filter(e -> e.getStudentName().equals(studentName))
                .findFirst()
                .orElse(null);
    }

    public Student getByGroup(String groupName){
        return list.stream()
                .filter(e -> e.getGroupName().equals(groupName))
                .findFirst()
                .orElse(null);
    }

}
