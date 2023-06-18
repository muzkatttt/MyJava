package teacher;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        int resultOfCompare = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfCompare == 0) {
            resultOfCompare = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfCompare == 0) {
                resultOfCompare = o1.getPatronymic().compareTo(o2.getPatronymic());
                if (resultOfCompare == 0) {
                    resultOfCompare = o1.getTeacherId().compareTo(o2.getTeacherId());
                    return o1.getTeacherId().compareTo(o2.getTeacherId());
                } else {
                    return resultOfCompare;
                }
            } else {
                return resultOfCompare;
            }
        }
        return resultOfCompare;
    }
}
