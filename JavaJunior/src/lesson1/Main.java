package lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // если в интерфейсе нет ни единого метода, то тогда он маркерный
//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x + y);
//            }
//        };
        PlainInterface plainInterface1 = (x,y) -> String.valueOf(x+y);
        System.out.println(plainInterface1.action(5, 3));

        PlainInterface plainInterface2 = (x, y)-> String.valueOf(Integer.compare(x, y));
        System.out.println(plainInterface2.action(1, 5));

        //метод compare() через лямбда-выражение
        //PlainInterface plainInterface4 = Integer::compare;
        //System.out.println(plainInterface4.action(1,5));


        // задача про лист строк
        List<String> list = Arrays.asList("Привет", "курс", "Java", "Junior", "!");

        list = list.stream().filter(str -> str.length() >4).collect(Collectors.toList());
        for (String item: list) {
            System.out.println(item);
        }

        // то же самое через лямбду
        list.stream().filter(str -> str.length() >4).forEach(System.out::println);

        list.stream().filter(str -> str.length() > 4).filter(str -> str.contains("o")).forEach(System.out::println);

        Arrays.asList(1, 10, 0, 7, 5).stream().sorted().forEach(System.out::println);

        Arrays.asList(1, 2, 3, 4, 5).stream().map(a -> "число " + a).forEach(System.out::println);

        // отсортировать массив и убрать дубликаты distinct()
        Arrays.asList(1, 1, 2, 3, 4, 5, 5).stream().sorted().distinct().forEach(System.out::println);

        // отсортировать, убрать дубликаты и взять первое число
        Arrays.asList(1, 1, 2, 3, 4, 5, 5).stream().sorted().distinct().findFirst();

        // задача со списком User`ов
        List<User> list1 = Arrays.asList(new User("Катя", 18), new User ("Катерина", 19));

        list1.stream().map(user -> new User(user.name, user.age + 10)).forEach(System.out::println);

        list1.stream()
                .map(user -> new User(user.name, user.age + 10))
                .filter(user -> user.age <= 18)
                .forEach(System.out::println);

    }

}
