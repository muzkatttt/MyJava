package model.student;


import model.abstractClass.Users;

public class Student extends Users {

    private int numberId;

    public Student(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
