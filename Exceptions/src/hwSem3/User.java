package hwSem3;

import javax.print.attribute.SetOfIntegerSyntax;

public class User {
    public String surname;
    public String name;

    public String patronymic;

    public String dateOfBirth;

    public String numberOfTelephone;

    public String gender;

    public User(String surname, String name, String patronymic, String dateOfBirth, String numberOfTelephone, String gender) {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumberOfTelephone() {
        return numberOfTelephone;
    }

    public void setNumberOfTelephone(String numberOfTelephone) {
        this.numberOfTelephone = numberOfTelephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        //<Фамилия><Имя><Отчество><дата рождения><номер телефона><пол>
        return "<" + getSurname() + "><" + getName() + "><" + getPatronymic()
                + "><" + getDateOfBirth() + "><" + getNumberOfTelephone() + "><"
                + getGender() + ">";
    }
}

