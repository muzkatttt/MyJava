package sem4;

import java.util.Comparator;
import java.util.HashMap;

public class Task3 {
    /*
    В рамках выполнения задачи необходимо:
Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
Найдите человека с самым маленьким номером телефона
Найдите номер телефона человека чье имя самое большое в алфавитном порядке
     */
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("893754654656", "Ilon mask");
        contacts.put("893754546644", "Tom Hanks");
        contacts.put("893721254544", "Alizee");
        contacts.put("892715555555", "Arnold Schwartz");
        contacts.put("292715555555", "No Schwartz");

//        System.out.println(getSmallNumber(contacts));
        System.out.println(getSmallNumberLoop(contacts));
        System.out.println(getBiggestNameLoop(contacts));
        System.out.println(getBiggestName(contacts));
    }

    public static String getSmallNumber(HashMap<String, String> contacts) {
        return contacts.entrySet().stream().min(Comparator.comparingLong(o -> Long.parseLong(o.getKey()))).get().getValue();
    }

    public static String getSmallNumberLoop(HashMap<String, String> contacts) {
        String smallestNum = "";
        for (var number : contacts.keySet()) {
            if (smallestNum.isEmpty()) {
                smallestNum = number;
            }
            if (Long.parseLong(smallestNum) > Long.parseLong(number)) smallestNum = number;
        }
        return contacts.get(smallestNum);

    }

    public static String getBiggestNameLoop(HashMap<String, String> contacts) {
        String biggestName = "";
        String resultName = "";
        for (var entry : contacts.entrySet()) {
            if (biggestName.isEmpty()) {
                biggestName = entry.getValue();
                resultName = entry.getKey();
            }
            if (biggestName.compareTo(entry.getValue()) < 0) {
                biggestName = entry.getValue();
                resultName = entry.getKey();
            }
        }
        return resultName;
    }

    public static String getBiggestName(HashMap<String, String> contacts) {
        return contacts.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get().getKey();
    }
}

