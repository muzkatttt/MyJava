import java.util.*;

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
}