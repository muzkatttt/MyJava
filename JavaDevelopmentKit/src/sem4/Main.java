package sem4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*
    В рамках выполнения задачи необходимо:
    1. Создайте коллекцию мужских и женских имен с помощью интерфейса List
    2. Отсортируйте коллекцию в алфавитном порядке
    3. Отсортируйте коллекцию по количеству букв в слове
    4. Разверните коллекцию
     */
    public static void main(String[] args) {
        List<String> names = generateList();
        System.out.println(names);
        sortByAlphabet(names);
        System.out.println(names);
        System.out.println(sortByLength(names));
        System.out.println(reverseList(names));
    }

    private static List<String> reverseList(List<String> names){
        return names.stream().sorted(Comparator.reverseOrder()).toList();
    }

    private static List<String> sortByLength(List<String> names) {
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        return names.stream().sorted((o1, o2) -> o1.length() - o2.length()).toList();
    }

    private static void sortByAlphabet(List<String> names){
        names.sort(null);
    }

    private static List<String> generateList(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Василий");
        names.add("Мария");
        names.add("Екатерина");
        names.add("Александр");
        names.add("Михаил");
        names.add("Иван");
        return names;
    }


}
