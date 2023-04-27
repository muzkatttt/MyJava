import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task3 {
    private static java.lang.String String;

    /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
        Для этого вы могли, например, удалять элементы после того как увеличили count.
        Либо предварительно создать коллекцию с уникальными значениями.
        Также можно было использовать метод Collections.frequency.
        За исключением этого момента задания решены верно
         */
    public static void main(String[] args) {
        List<String> listPlanets = List.of("Меркурий", "Меркурий",
                "Венера", "Земля", "Марс", "Юпитер", "Уран", "Нептун", "Плутон", "Плутон",
                "Марс", "Юпитер", "Уран", "Уран", "Юпитер");
        List<String> listCount = new ArrayList<>();
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < listPlanets.size(); i++) {
            for (int j = 1; j < listPlanets.size() - 1; j++) {
                if (listPlanets.get(i).equals(listPlanets.get(j))) {
                    listCount.add(listPlanets.get(i));
                    count++;
                }
            }
            System.out.println(listPlanets.get(i) + " встречается " + count + " раз(а)");
            count = 0;
        }
    }
}

