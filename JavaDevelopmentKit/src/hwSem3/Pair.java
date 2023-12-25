package hwSem3;

public class Pair<T, V>{
    /*
    Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
    а также переопределение метода toString(), возвращающее строковое представление пары.
    */

    // region Поля
    T firstElement;
    V secondElement;

    // endregion

    // region Конструкторы
    public Pair(T firstElement, V secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    // endregion

    // region Методы

    public T getFirstElement() {
        return firstElement;
    }

    public V getSecondElement() {
        return secondElement;
    }

    /**
     * Метод создания новой пары
     * @param firstElement первый элемент пары
     * @param secondElement второй элемент пары
     * @return new Pair
     * @param <T>
     * @param <V>
     */
    public static <T, V> Pair create(T firstElement, V secondElement) {
        return new Pair(firstElement, secondElement);
    }
    @Override
    public String toString() {
        return "Pair\n" +
                "firstElement: " + getFirstElement() +
                ", secondElement: " + getSecondElement() +
                ".";
    }
    // endregion

}
