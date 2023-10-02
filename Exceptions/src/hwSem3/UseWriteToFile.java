package hwSem3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UseWriteToFile {
    public void writeUserData(User user) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла для записи: \n>>> ");
        String fileName = scanner.nextLine();
        FileWriter writer = new FileWriter(fileName, true);
        String userDataString = String.join(" ",
                user.getSurname(),
                user.getName(),
                user.getPatronymic(),
                user.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                String.valueOf(user.getNumberOfTelephone()),
                user.getGender().toString());
        writer.write(userDataString);
        writer.write("\n");
        writer.close();
        System.out.println("Данные пользователя успешно обавлены в файл");
    }
}
