package model.teacher;

import model.abstractClass.Users;

public class Teacher extends Users {
    protected int id;

    public Teacher(String firstName, String secondName, int id) {
        super(firstName, secondName);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "teacherID " + getId()
                + " name " + getFirstName() + " " + getSecondName();

    }
}
