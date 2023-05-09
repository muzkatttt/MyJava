
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPhoneBook {
    private Map<Integer, String> book = new HashMap<>();

    public void methodAdd(Integer numberTelephone, String name) {
        book.put(numberTelephone, name);
    }

    public ArrayList<Integer> searchByName(String name) {
        ArrayList<Integer> telephones = new ArrayList<>();
        if (book.containsValue(name)) {
            for (Map.Entry<Integer, String> stringEntry : book.entrySet()) {
                if (name.equals(stringEntry.getValue())) {
                    telephones.add(stringEntry.getKey());
                }
            }
            return telephones;
        }
        return telephones;
    }

    public String searchByNumber(String numberTelephone) { // по факту является второй перегрузкой
        Integer af = Integer.parseInt(numberTelephone);
        return searchByNumber(af); // вызов метода с целочисленным значением аргумента
    }

    public String searchByNumber(Integer numberTelephone) {
        if (book.containsKey(numberTelephone)) {
           return book.get(numberTelephone);
        }
        return "";
    }


    public String getToList() { // формируем вывод контактов и номеров телефонов в справочнике
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

    /*
    public String searchContactFromUser() {
        StringBuilder sb = new StringBuilder();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите значение: \n");
        String searchName = myScanner.nextLine();

        if (searchName.chars().allMatch(Character::isDigit)) {
            Integer af = Integer.parseInt(searchName);
            if (book.containsKey(af)) {
                sb.append(book.get(af));
            } else {
                sb.append("Значение не найдено");
            }

        } else {
            if (book.containsValue(searchName)) {
                for (Map.Entry<Integer, String> stringEntry : book.entrySet()) {
                    if (searchName.equals(stringEntry.getValue())) {
                        // stringEntry.getValue() - получаем значение и с ним работаем
                        sb.append(stringEntry.getKey());
                        sb.append(": ");
                        sb.append(stringEntry.getValue());
                        sb.append("\n");
                    }
                }
            } else {
                sb.append("Значение не найдено");
            }
        }
        return sb.toString();
    }
    */

    public String searchContactFromUser() {
        StringBuilder sb = new StringBuilder();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите значение: \n");
        String searchName = myScanner.nextLine();

        if (searchName.chars().allMatch(Character::isDigit)) {
            String name = searchByNumber(searchName);
            sb.append(name.length() !=0 ? name : "Значение не найдено");
        } else {
            ArrayList<Integer> list = searchByName(searchName);
            sb.append(list.size() !=0 ? list : "Значение не найдено");
        }
        return sb.toString();
    }

    public String toString() {
        return book.toString();
    }

}




