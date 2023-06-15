package model.teacher;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        } else {
            return resultOfComparing;
        }
        return resultOfComparing;
    }
}
