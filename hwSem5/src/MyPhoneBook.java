
import java.util.HashMap;
import java.util.Map;

public class MyPhoneBook {
    private Map<Integer, String> book = new HashMap<>();

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

    public String searchTelephone(Integer numberTelephone, String name) {
        if (book.containsKey(numberTelephone)) {
            System.out.println("Номер " + numberTelephone + " у контакта " + name);
        } else {
            System.out.println("Ничего не найдено по запросу");
        }
        return name;
    }


    String getToList() { // формируем вывод контактов и номеров телефонов в справочнике
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : book.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    // второй метод сортировки телефонного справочника (по алфавиту)
    public void sorted2() {
        book.entrySet().stream().sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }

    public String toString() {
        return book.toString();
    }

}




