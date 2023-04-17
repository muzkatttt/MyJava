public class funcMethods {

    /*
Функции и методы
Функции и методы — это технически одно и то же. Функции могут
не принадлежать классам, а методы принадлежат.
В java все функции являются методами.
Описание - при описании обязательно должен быть класс
Вызов
Возвращаемое значение Рекурсия
     */
    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int factor(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factor(n - 1);
    }

    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}

