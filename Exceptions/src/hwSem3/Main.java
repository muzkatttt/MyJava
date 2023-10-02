package hwSem3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Напишите приложение, которое будет запрашивать у пользователя следующие данные
         * в произвольном порядке, разделенные пробелом:
         * Фамилия Имя Отчество дата рождения номер телефона пол
         * Форматы данных:
         * фамилия, имя, отчество - строки
         * датарождения - строка формата dd.mm.yyyy
         * номертелефона - целое беззнаковое число без форматирования
         * пол - символ латиницей f или m.
         * Приложение должно проверить введенные данные по количеству.
         * Если количество не совпадает с требуемым, вернуть код ошибки,
         * обработать его и показать пользователю сообщение,
         * что он ввел меньше и больше данных, чем требуется.
         * Приложение должно попытаться распарсить полученные значения
         * и выделить из них требуемые параметры.
         * Если форматы данных не совпадают, нужно бросить исключение,
         * соответствующее типу проблемы.
         * Можно использовать встроенные типы java и создать свои.
         * Исключение должно быть корректно обработано, пользователю выведено сообщение
         * с информацией, что именно неверно.
         * Если всё введено и обработано верно, должен создаться файл с названием,
         * равным фамилии, в него в одну строку должны записаться полученные данные,
         * вида <Фамилия><Имя><Отчество><датарождения><номертелефона><пол>
         * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
         * Не забудьте закрыть соединение с файлом.
         * При возникновении проблемы с чтением-записью в файл,
         * исключение должно быть корректно обработано, пользователь
         * должен увидеть стектрейс ошибки.
         */

        List<String> usersGroup = new ArrayList<String>();
        try {
            String stringMessage = inputFromUser();
            List<String> userList = parseStringFromUser(stringMessage);
            usersGroup.add(stringMessage);
        } catch (MyListSizeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(usersGroup);
    }

    public static String inputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество, дату рождения, номер телефона, пол через пробел \n>>>");
        String message = scanner.nextLine();
        return message;
    }

    public static List<String> parseStringFromUser(String messageFromUser) throws MyListSizeException {
        List<String> users = new ArrayList<>();
        if (!messageFromUser.isEmpty()) {
            messageFromUser.split(" ");
            users.add(messageFromUser);
        } else {
            throw new MyListSizeException("Введена пустая строка. Повторите ввод");
        }
        return users;
    }

    public String toString() {
        //<Фамилия><Имя><Отчество><дата рождения><номер телефона><пол>
        try {
            return "<" +
                    + "><" + User.class.getName() + "><"
                    + parseStringFromUser(inputFromUser()).get(2)
                    + "><" + parseStringFromUser(inputFromUser()).get(3)
                    + "><" + parseStringFromUser(inputFromUser()).get(4) + "><"
                    + parseStringFromUser(inputFromUser()).get(5) + ">";
        } catch (MyListSizeException e) {
            throw new RuntimeException(e);
        }
    }
}
//    public static String parseStringFromUser(String message) throws MyListSizeException {
//        if (message.matches("\\d")) {
//            message = message.replaceAll("\\d", " ");
//            //throw new RuntimeException("В строке присутствуют ошибки, укажите данные через пробел");
//        } else {
//            message.split(" ");
//            if (message.length() == 6) {
//                //String surname = message.formatted(0);
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("<");
//                stringBuilder.append(message.formatted(0));
//                stringBuilder.append(" ");
//                stringBuilder.append(message.formatted(1));
//                stringBuilder.append(" ");
//                stringBuilder.append(message.formatted(2));
//                stringBuilder.append("><");
//                stringBuilder.append(message.formatted(3));
//                stringBuilder.append("><");
//                stringBuilder.append(message.formatted(4));
//                stringBuilder.append("><");
//                stringBuilder.append(message.formatted(5));
//                stringBuilder.append(">");
//                System.out.println(stringBuilder);
//        /*
//        List<String> userList = Arrays.asList(message.split(" "));
//        if (userList.size() == 6) {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("<");
//            stringBuilder.append(userList.get(0));
//            stringBuilder.append(" ");
//            stringBuilder.append(userList.get(1));
//            stringBuilder.append(" ");
//            stringBuilder.append(userList.get(2));
//            stringBuilder.append("><");
//            stringBuilder.append(userList.get(3));
//            stringBuilder.append("><");
//            stringBuilder.append(userList.get(4));
//            stringBuilder.append("><");
//            stringBuilder.append(userList.get(5));
//            stringBuilder.append(">");
//            System.out.println(stringBuilder);
//
//         */
//            } else {
//                throw new MyListSizeException("В строке введено " + message.length() + " элемент(-а/-ов)");
//            }
//
//        }
//      return message;
//    }
