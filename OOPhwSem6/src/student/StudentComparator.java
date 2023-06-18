package student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getUserId().compareTo(o2.getUserId());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            if (resultOfComparing == 0) {
                resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
                if (resultOfComparing == 0) {
                    return o1.getPatronymic().compareTo(o2.getPatronymic());
                }
                return resultOfComparing;
            } else {
                return resultOfComparing;
            }
        }
        return resultOfComparing;
    }
}

