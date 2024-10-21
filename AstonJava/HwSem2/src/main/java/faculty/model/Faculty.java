package faculty.model;

import faculty.entity.Course;
import faculty.entity.Instructor;

public class Faculty {
    private final Course course;
    private final Instructor instructor;

    //TODO добавить запись на курс,
    // по окончанию курса выставление оценок преподавателем и сохранение оценок в архив
    public Faculty(Course course, Instructor instructor) {
        this.course = course;
        this.instructor = instructor;
    }

    public Course getCourse() {
        return course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Faculty{");
        sb.append("course=").append(course);
        sb.append(", instructor=").append(instructor);
        sb.append('}');
        return sb.toString();
    }
}
