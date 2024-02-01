package sem1.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Корзина
 *
 * @param <T> Еда
 */
public class Cart<T extends Food> {

    //region Поля

    /**
     * Товары в магазине
     */
    private final ArrayList<T> foodstuffs;
    private final UMarket market;
    private final Class<T> clazz;

    //endregion

    //region Конструкторы

    /**
     * Создание нового экземпляра корзины
     *
     * @param market принадлежность к магазину
     */
    public Cart(Class<T> clazz, UMarket market) {
        this.clazz = clazz;
        this.market = market;
        foodstuffs = new ArrayList<>();
    }

    //endregion

    /**
     * Балансировка корзины
     */
//    public void cardBalancing()
//    {
//        boolean proteins = false;
//        boolean fats = false;
//        boolean carbohydrates = false;
//
//        for (var food : foodstuffs)
//        {
//            if (!proteins && food.getProteins())
//                proteins = true;
//            else
//            if (!fats && food.getFats())
//                fats = true;
//            else
//            if (!carbohydrates && food.getCarbohydrates())
//                carbohydrates = true;
//            if (proteins && fats && carbohydrates)
//                break;
//        }
//
//        if (proteins && fats && carbohydrates)
//        {
//            System.out.println("Корзина уже сбалансирована по БЖУ.");
//            return;
//        }
//
//        for (var thing : market.getThings(clazz))
//        {
//            if (!proteins && thing.getProteins())
//            {
//                proteins = true;
//                foodstuffs.add(thing);
//            }
//            else if (!fats && thing.getFats())
//            {
//                fats = true;
//                foodstuffs.add(thing);
//            }
//            else if (!carbohydrates && thing.getCarbohydrates())
//            {
//                carbohydrates = true;
//                foodstuffs.add(thing);
//            }
//            if (proteins && fats && carbohydrates)
//                break;
//        }
//
//        if (proteins && fats && carbohydrates)
//            System.out.println("Корзина сбалансирована по БЖУ.");
//        else
//            System.out.println("Невозможно сбалансировать корзину по БЖУ.");
//
//    }


    // переделка метода балансировки корзины для ДЗ
    public void cardBalancing() {
        final boolean[] proteins = {foodstuffs.stream().anyMatch(Food::getProteins)};
        AtomicBoolean fats = new AtomicBoolean(foodstuffs.stream().anyMatch(Food::getFats));
        AtomicBoolean carbohydrates = new AtomicBoolean(foodstuffs.stream().anyMatch(Food::getCarbohydrates));

        if (proteins[0] && fats.get() && carbohydrates.get()) {
            System.out.println("Корзина уже сбалансирована по БЖУ.");
        }

        for (T thing : market.getThings(clazz)) {
            if ((!proteins[0] && thing.getProteins()) || (!fats.get() && thing.getFats())
                    || (!carbohydrates.get() && thing.getCarbohydrates())) {
                foodstuffs.add(thing);
                proteins[0] = proteins[0] || thing.getProteins();
                fats.set(fats.get() || thing.getFats());
                carbohydrates.set(carbohydrates.get() || thing.getCarbohydrates());
            }
            if (proteins[0] && fats.get() && carbohydrates.get())
                break;
        }

        Runnable balance = () -> {
            boolean proteins1 = true;
            boolean fats1 = true;
            boolean carbohydrates1 = true;

            String result = (proteins1 && fats1 && carbohydrates1) ? "Корзина сбалансирована по БЖУ." : "Невозможно сбалансировать корзину по БЖУ.";
            System.out.println(result);
        };

        balance.run();
    }

    public Collection<T> getFoodstuffs() {
        return foodstuffs;
    }

    /**
     * Распечатать список продуктов в корзине
     */
    public void printFoodstuffs() {
        /*int index = 1;
        for (var food : foodstuffs)
            System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s)\n", index++, food.getName(), food.getProteins() ? "Да" : "Нет",
                    food.getFats() ? "Да" : "Нет", food.getCarbohydrates() ? "Да" : "Нет");
         */
        AtomicInteger index = new AtomicInteger(1);
        foodstuffs.forEach(food -> System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s)\n",
                index.getAndIncrement(), food.getName(),
                food.getProteins() ? "Да" : "Нет",
                food.getFats() ? "Да" : "Нет",
                food.getCarbohydrates() ? "Да" : "Нет"));
    }
}
