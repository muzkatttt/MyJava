package ru.gb.hwsem2;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {

    private ArrayList<Student> list = new ArrayList<>();

    public StudentRepository() {
        list.add(new Student("Liubov`", "Developers"));
        list.add(new Student("Andrey", "Developers"));
        list.add(new Student("Denis", "Developers"));
        list.add(new Student("Evgenya", "Developers"));
        list.add(new Student("Petr", "Developers"));
        list.add(new Student("Arina", "Designers"));
        list.add(new Student("Yaroslav", "Designers"));
        list.add(new Student("Galina", "Designers"));
        list.add(new Student("Aleksandra", "Designers"));
    }

    public ArrayList<Student> getAll(){
        List.copyOf(list);
        return list;
    }

    public Student getById(long id){
        return list.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
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
                .findAny()
                .orElse(null);
    }

}
