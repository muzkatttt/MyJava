package model.teacher;

import model.abstractClass.Users;

public class Teacher extends Users {
    private int id;

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
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
