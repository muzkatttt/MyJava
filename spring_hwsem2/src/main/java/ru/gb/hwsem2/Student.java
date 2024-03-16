package ru.gb.hwsem2;

import lombok.Data;

@Data
public class Student {

    //Создать Класс Student c полями: идентификатор, имя, имя группы
    private static long curId = 0;
    private long id;
    private String studentName;
    private String groupName;

    public Student(String studentName, String groupName) {
        this.id = curId++;
        this.studentName = studentName;
        this.groupName = groupName;
    }
}

