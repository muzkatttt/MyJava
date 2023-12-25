package hwSem3;

public class Calculate {
    /* Написать класс Калькулятор (необобщенный),
    который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract().
    */
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        System.out.println(sum(2, 2.5));
        System.out.println(multiply(2f, 3.52));
        System.out.println(divide(9.00, 3f));
        //System.out.println(divide(6, 0));
        System.out.println(subtract(10, 5L));
    }

    /**
     * @param t   слагаемое
     * @param v   слагаемое
     * @param <T> первое число extends Number
     * @param <V> второе число extends Number
     * @return сумма чисел t + v
     */
    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return Math.round(t.doubleValue() + v.doubleValue());
    }

    /**
     * @param t   первый множитель
     * @param v   второй множитель
     * @param <T> первое число extends Number
     * @param <V> второе число extends Number
     * @return произведение чисел t * v
     */
    public static <T extends Number, V extends Number> double multiply(T t, V v) {
        return Math.round(t.doubleValue() * v.doubleValue());
    }

    /**
     * @param t   делимое
     * @param v   делитель
     * @param <T> первое число extends Number
     * @param <V> второе число extends Number
     * @return частное чисел t / v
     */
    public static <T extends Number, V extends Number> double divide(T t, V v) {
        if (v.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return Math.round(t.doubleValue() / v.doubleValue());
    }

    /**
     * @param t   уменьшаемое
     * @param v   вычитаемое
     * @param <T> первое число extends Number
     * @param <V> второе число extends Number
     * @return разность чисел t - v
     */
    public static <T extends Number, V extends Number> double subtract(T t, V v) {
        return Math.round(t.doubleValue() - v.doubleValue());
    }
}

