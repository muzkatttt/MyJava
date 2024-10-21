package faculty.entity;

public class Instructor extends Human {
    private final String name;
    private Course course;

    public Instructor(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

}
