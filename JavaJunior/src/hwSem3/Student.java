package hwSem3;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    private int age;

    transient double GPA; // средний балл студента

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Student create(String name, int age, double GPA) {
        return new Student(name, age, GPA);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", GPA=").append(GPA);
        sb.append('}');
        return sb.toString();
    }
}
