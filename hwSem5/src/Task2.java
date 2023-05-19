import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        /*
        Пусть дан список сотрудников: Иван Иванов, Светлана Петрова,
        Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков,
        , Петр Чернышов, Мария Федорова, Марина Светлова,
        Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
        Иван Мечников, Петр Петин, Иван Ежов.
        Написать программу, которая найдет и выведет повторяющиеся имена
        с количеством повторений.
        Отсортировать по убыванию популярности.
        Для сортировки использовать TreeMap.
         */
        String[] namesAll = new String[]{"Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String item : namesAll) { // перебираем строки
            int count = 0;
            String names = item.split(" ")[0];
            for (String find : namesAll) { // проверка
                if (names.equals(find.split(" ")[0])) {
                    count++;
                }
            }
            if (map.containsKey(count)) {
                List<String> list = map.get(count);
                if (!list.contains(names)) {
                    list.add(names);
                }

            } else {
                List<String> list = new ArrayList<>();
                list.add(names);
                map.put(count, list);
            }
        }
        System.out.println(map);
    }
    /*
    // решение от Алексея
    public static void main(String[] args) {
        Map<String, Integer> namePeople = new HashMap<>();

        String[] staff = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };
        countName(staff, namePeople);
        sortedStaff(namePeople);

    }

    public static void countName(String[] people, Map<String, Integer> namePeople) {
        for (String person : people) {
            String name = person.split(" ")[0];
            if (namePeople.containsKey(name)) {
                namePeople.put(name, namePeople.get(name) + 1);
            } else {
                namePeople.put(name, 1);
            }
        }
    }

    public static void sortedStaff(Map<String, Integer> namePeople) {
        Map<String, Integer> sortedName = namePeople.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        System.out.println("Не отсортированный список:\n" + namePeople + "\n\nСписок по убыванию:");
        sortedName.entrySet().forEach(System.out::println);
    }
    */

}