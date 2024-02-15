package hwSem3;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Student implements Serializable {

    // region Поля

    private String name;
    private int age;

    @JsonIgnore
    transient double gpa; // средний балл студента

    // endregion


    // region Конструкторы
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = getGpa();
    }

    public Student() {
    }
    // endregion


    // region Методы
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa(){
        return gpa;
    };

    public static Student create(String name, int age, double gpa) {
        return new Student(name, age, gpa);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", GPA=").append(gpa);
        sb.append('}');
        return sb.toString();
    }
    // endregion
}
