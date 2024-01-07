package sem4;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    //В рамках выполнения задачи необходимо:
//Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
//Получите уникальный список Set на основании List
//Определите наименьший элемент (алфавитный порядок)
//Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
//Удалите все элементы содержащие букву ‘A’

    public static void main(String[] args) {
        List<String> names = new ArrayList<>() {{
            add("Катя");
            add("Катя");
            add("Катя");
            add("Арсений");
            add("Виктор");
            add("Гюг");
            add("Арсений");
            add("Анатолий");
        }};

        Set<String> uniqNames = getUniq(names);
        System.out.println(uniqNames);

        System.out.println(getMin(uniqNames));
        System.out.println(getMax(uniqNames));
        System.out.println(uniqNames);
        System.out.println(deleteSomeLoop(uniqNames));
//        System.out.println(deleteSomeFilter(uniqNames));
//        deleteSome(uniqNames);
//        System.out.println(uniqNames);

    }

    public static Set<String> getUniq(List<String> list) {
        return new HashSet<>(list);
    }

    public static String getMin(Set<String> names) {
        return names.stream().max(Comparator.naturalOrder()).get();
    }

    public static String getMax(Set<String> names) {
        return names.stream().min(Comparator.comparing(String::length)).get();
    }

    public static void deleteSome(Set<String> names) {
        names.removeIf(x -> x.contains("А") || x.contains("а"));
    }

    public static Set<String> deleteSomeFilter(Set<String> names) {
        return names.stream().filter(x -> !x.contains("А") && !x.contains("а")).collect(Collectors.toSet());
    }

    public static Set<String> deleteSomeLoop(Set<String> names) {
        Set<String> result = new HashSet<>();
        for (String s : names) {
            if (!s.contains("А") && !s.contains("а")) result.add(s);
        }
        return result;
    }
}

