package faculty.entity;


import java.util.ArrayList;
public class Course {

    public String nameOfCourse;

    public Course(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }


    /**
     * Метод, записывающий студентов на курс
     * @param student - студент курса
     * @param studentsList список студентов
     */
    public void addToTheCourse(Student student, ArrayList<Student> studentsList) {
        studentsList.add(student);
        System.out.printf("Студент %s добавлен на курс %s.\n",
                student.getName(),
                getNameOfCourse());
    }

}
