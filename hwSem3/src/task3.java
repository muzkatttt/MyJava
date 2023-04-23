import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {
    /*
    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    Вывести название каждой планеты и количество его повторений в списке.
     */
    public static void main(String[] args) {
        List<String> listPlanets = new ArrayList<>(Arrays.asList("Земля", "Уран", "Марс", "Меркурий", "Венера",
                "Земля", "Венера", "Меркурий", "Юпитер", "Меркурий", "Земля", "Юпитер", "Уран",
                "Нептун", "Венера", "Плутон", "Сатурн", "Нептун", "Сатурн", "Юпитер"));
        System.out.println(listPlanets);
        int count = 0;
        for (int i = 0; i < listPlanets.size(); i++) {
            for (int j = 0; j < listPlanets.size(); j++) {
                System.out.println(listPlanets.get(i));
                //if (listPlanets.get(i).equals(listPlanets.get(j)));
                count++;
            }
//            System.out.println(i);
//            System.out.println(count);
            }
        }

        //public static String countPlanets(String[] args) {

        //}

    }

