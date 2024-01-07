package sem3;

import java.io.DataInput;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
//        T_1<String, Integer, Float> t_1 = new T_1<>("Один", 1, 1f);
//        t_1.showTypes();
    }

    /**
     * Создать обобщенный класс с тремя параметрами (T, V, K).
     * Класс содержит три переменные типа (T, V, K),
     * конструктор, принимающий на вход параметры типа (T, V, K),
     * методы возвращающие значения трех переменных.
     * Создать метод, выводящий на консоль имена классов для трех переменных класса.
     * Наложить ограничения на параметры типа:
     * T должен реализовать интерфейс Comparable,
     * V должен реализовать интерфейс DataInput и расширять класс InputStream,
     * K должен расширять класс Number.
     */
    class T_1<T extends Comparable<T>, V extends InputStream & DataInput, K extends Number> {

        T first;
        V second;
        K third;

        public T_1(T first, V second, K third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public void showTypes() {
            System.out.println(first.getClass().getName());
            System.out.println(second.getClass().getName());
            System.out.println(third.getClass().getName());
        }

        //region геттеры
        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        public K getThird() {
            return third;
        }
        //endregion
    }
}
