package hwSem3;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputFromUser {

    private Scanner scanner;

    public InputFromUser(Scanner scanner) {
        this.scanner = scanner;
    }


    public User inputFromUser() throws UserException {
        while (true) {
            System.out.println("Введите через пробел: \n" +
                    "фамилию, имя, отчество --> русскими или латинскими буквами\n" +
                    "дату рождения --> в формате dd.mm.yyyy,\n" +
                    "номер телефона --> строковое значение,\n" +
                    "пол --> male или female, где male = мужской, female = женский\n>>> ");
            try {
                String input = scanner.nextLine();
                String[] messageFromUser = input.split(" ");

                if (messageFromUser.length > 6) {
                    throw new UserException("Введено больше данных о пользователе, чем требуется. Повторите ввод.");
                } else if (messageFromUser.length < 6) {
                    throw new UserException("Введено меньше данных о пользователе, чем требуется. Повторите ввод.");
                }

                LocalDate dateOfBirth = parseDateOfBirth(messageFromUser[3]);
                String phoneNumber = String.valueOf(parsePhoneNumber(messageFromUser[4]));
                Gender gender = parseGender(messageFromUser[5]);

                return new User(messageFromUser[0], messageFromUser[1], messageFromUser[2], dateOfBirth, phoneNumber, gender);
            } catch (ParseException | NumberFormatException e) {
                System.out.println("Ошибка при парсинге данных: " + e.getMessage());
            } catch (ExceptionParseFromUser e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String parsePhoneNumber(String phoneNumberString) throws ExceptionParseFromUser {
        try {
            return phoneNumberString;
        } catch (NumberFormatException e) {
            throw new ExceptionParseFromUser();
        }
    }

    private LocalDate parseDateOfBirth(String dateOfBirthString) throws ExceptionParseFromUser {
        try {
            return LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new ExceptionParseFromUser();
        }
    }

    private Gender parseGender(String genderString) throws ParseException {
        if (genderString.equalsIgnoreCase("male")) {
            return Gender.MALE;
        } else if (genderString.equalsIgnoreCase("female")) {
            return Gender.FEMALE;
        } else {
            throw new ParseException("Введите пол корректно male/female", 0);
        }
    }
}
