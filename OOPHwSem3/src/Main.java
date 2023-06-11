import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Добавить к торговому аппарату с горячими напитками
        Comparable (сортировку по ценам, цены должны быть типа Long)
        Формат сдачи:
        Ссылка на гитхаб проект
        Подписать фамилию и номер группы
        */

        //test();
        HotDrinkMachine drink = new HotDrinkMachine();
//        System.out.println(drink.getPrice("Black Tea"));
//        System.out.println(drink.getPrice("Green Tea"));
//        System.out.println(drink.getPrice("Red Tea"));
//        System.out.println(drink.getPrice("Aqua"));
//        System.out.println(drink.getPrice("Coffee"));

        drink.addDrink("White Tea", 299L, 400);
        //System.out.println(drink.getPrice("White Tea"));

        System.out.println(drink.getHotDrink("White Tea", 40));
        System.out.println(drink.getHotDrink("Black Tea", 79));
        System.out.println(drink.getHotDrink("Green Tea", 70));
        System.out.println(drink.getHotDrink("Red Tea", 80));
        System.out.println(drink.getHotDrink("Aqua", 10));
        System.out.println(drink.getHotDrink("Coffee", 80));

        System.out.println();
        for(HotDrink hz : drink.myList()){
            System.out.println(hz);
        }

    }

    private static void test() {
        HotDrink blackTea = new HotDrink("Black tea", 350L, 400, 79);
        HotDrink greenTea = new HotDrink("Green tea", 400L, 450, 70);
        HotDrink hotBlackTea = new HotDrink("Black tea", 300L, 399, 80);
        HotDrink aqua = new HotDrink("Aqua", 100L, 10, 10);
        HotDrink coffee = new HotDrink("Coffee", 299L, 300, 80);

        List<HotDrink> list = new ArrayList<>();
        list.add(blackTea);
        list.add(greenTea);
        list.add(hotBlackTea);
        list.add(aqua);
        list.add(coffee);
        System.out.println(list);
        System.out.println(list.stream().sorted().toList()); // Comparable
        System.out.println();
        list.sort(new HotDrinkComparatorPrice().reversed());
        System.out.println(list);
    }
}
