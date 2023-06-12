import controller.Controller;
import model.Disciples;
import model.Student;
import model.Teacher;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher sensei = new Teacher("Van Li", 1968, Disciples.PROGRAMMING);

        Student katya = new Student("Katya jafsjfajjvna", 1999);
        Student vasya = new Student("Vasya afahahfvich", 1985);
        Student kirill = new Student("Kirill Zoomovich", 1932);

        List<Student> list = new ArrayList<>(Arrays.asList(katya, vasya, kirill));

        controller.create(list, sensei);
        controller.read();
    }
}
