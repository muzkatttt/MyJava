package model.student;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        } else {
            return resultOfComparing;
        }
        return resultOfComparing;
    }
}
