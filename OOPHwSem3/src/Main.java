import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Добавить к торговому аппарату с горячими напитками
        Comparable (сортировку по ценам, цены должны быть типа Long)
        Формат сдачи:
        Ссылка на гитхаб проект
        Подписать фамилию и номер группы
        */

        HotDrink blackTea = new HotDrink("Black tea", 100L, 300, 40);
        HotDrink greenTea = new HotDrink("Green tea", 150L, 400, 80);
        HotDrink hotBlackTea = new HotDrink("Black tea", 150L, 400, 90);
        HotDrink aqua = new HotDrink("Aqua", 80L, 100, 10);
        HotDrink coffee = new HotDrink("Coffee", 300, 90);

        List<HotDrink> list = new ArrayList<>();
        list.add(blackTea);
        list.add(greenTea);
        list.add(hotBlackTea);
        list.add(aqua);
        list.add(coffee);

//        Collections.sort(list);
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        list.sort(new HotDrinkVendingMachine("Black tea",
//                300, 50), new HotDrinkVendingMachine("Green Tea", 400, 70),
//                new HotDrinkVendingMachine("Aqua", 500, 10));
//        PriceComparator priceComparator = new PriceComparator();

//        System.out.println(priceComparator);
//        Collections.sort(list);
        list.sort((o1, o2) -> Long.compare(o1.price, o2.price));
        System.out.println(list);
    }
}
