package users;

import abstractClasses.BaseUser;
import interfaceUser.UserInterface;

import java.time.LocalDate;

public class User extends BaseUser implements UserInterface {
    private LocalDate dateOfBirth;
    private int userId;

    public User() {
        setFirstName(firstName);
        setSecondName(secondName);
        setPatronymic(patronymic);
        setDateOfBirth(dateOfBirth);
        setUserId(userId);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }

        User user = (User) obj;

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
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}
