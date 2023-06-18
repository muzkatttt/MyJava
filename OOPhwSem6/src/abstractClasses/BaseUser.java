package abstractClasses;

import java.time.LocalDate;

public abstract class BaseUser {
    protected String firstName;
    protected String secondName;
    protected String patronymic;
    protected LocalDate dateOfBirth;

    public BaseUser() {
    }

    public BaseUser(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setSecondName(secondName);
        setPatronymic(patronymic);
        setDateOfBirth(dateOfBirth);
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
}
