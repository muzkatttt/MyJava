package users;

import abstractClasses.BaseUser;
import interfaceUser.UserInterface;

import java.time.LocalDate;

public class User extends BaseUser implements UserInterface {
    protected String firstName;
    protected String secondName;
    protected String patronymic;
    protected LocalDate dateOfBirth;
    protected Integer userId;

    public User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Integer userId) {
        setFirstName(firstName);
        setSecondName(secondName);
        setPatronymic(patronymic);
        setDateOfBirth(dateOfBirth);
        setUserId(userId);
    }

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



    @Override
    public String toString() {
        return "users.User " +
                "имя " + getFirstName() + '\'' +
                ", фамилия " + getSecondName() + '\'' +
                ", отчество " + getPatronymic() + '\'' +
                ", дата рождения " + getDateOfBirth() + '\'' +
                ", id " + getUserId() +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        if (getUserId() != null ? !getUserId().equals(user.getUserId()) : user.getUserId() != null) {
            return false;
        }
        return getDateOfBirth() != null ? !getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}



