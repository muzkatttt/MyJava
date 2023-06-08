package Task2MyCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //#region Intro Iterator
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iterOne = nums.iterator();
        while (iterOne.hasNext()) {
            System.out.println(iterOne.next());
        }

        //#endregion
        //#region Worker Iterator

        Worker worker = new Worker(
                "Имя", "Фамилия", 23, 1000);

        Iterator<String> components = worker;

        while (components.hasNext()) {
            System.out.println(worker.next());
        }

        //#endregion

        //#region Beverage Iterator

        Beverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Вeans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //#endregion
    }
}
