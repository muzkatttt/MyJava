package sem1.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Магазин U-Market
 */
public class UMarket {

    public <T extends Thing> void printThings(Class<T> clazz){

        /*int index = 1;
        for (var thing : things)
        {
            if (clazz.isInstance(thing))
            {
                if (Food.class.isAssignableFrom(thing.getClass())){
                    System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s)\n", index++, thing.getName(), ((Food)thing).getProteins() ? "Да" : "Нет",
                            ((Food)thing).getFats() ? "Да" : "Нет", ((Food)thing).getCarbohydrates() ? "Да" : "Нет");

                }
                else{
                    System.out.printf("[%d] %s\n", index++, thing.getName());
                }
            }
        }*/

        int[] index = {1};

        things.stream()
                .filter(clazz::isInstance)
                .forEach(thing -> {
                    if (Food.class.isAssignableFrom(thing.getClass())) {
                        Food foodThing = (Food) thing;
                        System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s)\n",
                                index[0]++, thing.getName(),
                                foodThing.getProteins() ? "Да" : "Нет",
                                foodThing.getFats() ? "Да" : "Нет",
                                foodThing.getCarbohydrates() ? "Да" : "Нет");
                    } else {
                        System.out.printf("[%d] %s\n", index[0]++, thing.getName());
                    }
                });
    }

    public <T extends Thing> T getThingByIndex(Class<T> clazz, int index)
    {
        /*int counter = 1;
        for (var thing : things)
        {
            if (clazz.isAssignableFrom(thing.getClass())){
                if (index == counter++)
                    return (T)thing;
            }
        }
        return null;*/

        AtomicInteger counter = new AtomicInteger(1);
        return things.stream()
                .filter(clazz::isInstance)
                .filter(thing -> index == counter.getAndIncrement())
                .map(clazz::cast)
                .findFirst()
                .orElse(null);

    }
    public <T extends Thing> Collection<T> getThings(Class<T> clazz)
    {
        /*Collection<T> list = new ArrayList<>();
        for (var thing : things)
        {
            if (clazz.isAssignableFrom(thing.getClass())){
                list.add((T)thing);
            }
        }
        return list;*/
        return things.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .toList();

    }

    private void initializeThings()
    {
        things.add(new Pen());
        things.add(new Notebook());

        things.add(new Chicken());
        things.add(new Fruit());
        things.add(new OliveOil());

        things.add(new BalykCheese());
        things.add(new Crisps());
        things.add(new ChocolateBar());

        things.add(new DumplingsBerries());
        things.add(new DumplingsMeat());
        things.add(new Cheburek());
    }

    //region Конструкторы

    public UMarket()
    {
        things = new ArrayList<>();
        initializeThings();
    }

    //endregion

    //region Поля

    /**
     * Товары в магазине
     */
    private final Collection<Thing> things;

    //endregion
}
