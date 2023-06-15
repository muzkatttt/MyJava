package model.abstractClass;

public abstract class Users {

    private String firstName;

    private String secondName;

    public Users(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                '}';
    }

}
