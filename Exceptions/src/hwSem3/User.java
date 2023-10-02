package hwSem3;

import java.time.LocalDate;

public class User {
    private String surname;
    private String name;

    private String patronymic;

    private LocalDate dateOfBirth;

    private String numberOfTelephone;

    private Gender gender;

    public User(String surname, String name, String patronymic, LocalDate dateOfBirth,
                String numberOfTelephone, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.numberOfTelephone = numberOfTelephone;
        this.gender = gender;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getNumberOfTelephone() {
        return numberOfTelephone;
    }

    public void setNumberOfTelephone(String numberOfTelephone) {
        this.numberOfTelephone = numberOfTelephone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }

    @Override
    public String toString() {
        //<Фамилия><Имя><Отчество><дата рождения><номер телефона><пол>
        return "<" + getSurname() + "><" + getName() + "><" + getPatronymic()
                + "><" + getDateOfBirth() + "><" + getNumberOfTelephone() + "><"
                + getGender() + ">";
    }
}

