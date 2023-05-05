import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPhoneBook {
    private Map<Integer, String> book = new HashMap<>();
    // моя задача: попробовать организовать свой класс, внутрь него поместить поле стринг,
    // добавить несколько методов (добавляет контакт, ищет контакт и показывает все контакты)

    void methodAdd(Integer numberTelephone, String name) {
        book.put(numberTelephone, name);
    }

    public String searchName(String name) {
        if (book.containsValue(name))
            System.out.println("Найден контакт " + name);
        else {
            System.out.println("контакт не найден");
        }
        return name;
    }

    public Integer searchTelephone(Integer numberTelephone) {
        if (book.containsKey(numberTelephone))
            System.out.println("Найден номер " + numberTelephone);
        else {
            System.out.println("Не найден");
        }
        return numberTelephone;
    }

    String getToList() { // формируем красивый вывод контактов и номеров телефонов в справочнике
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : book.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public String toString() {
        return book.toString();
    }
}



