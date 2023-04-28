public class Task2 {
    public static void main(String[] args) {
        ts2();
    }

    public static void ts2() {
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
        MethodsTask2 queue = new MethodsTask2();
        queue.add();
        queue.add();
        System.out.println(queue.enqueue());
        System.out.println("Количество элементов в очереди: " + queue.enqueue());
    }
}
/*
// =====================================
// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди,
// - dequeue() - возвращает первый элемент из очереди и удаляет его,
// - first() - возвращает первый элемент из очереди, не удаляя.
// =====================================

package Seminars.Seminar4;

import java.util.LinkedList;

public class hw4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(ll, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(ll);

        System.out.println(dequeue(ll)); // удалили первый элемент
        System.out.println(ll);

        System.out.println(first(ll)); // вывели первый элемент
        System.out.println(ll);
    }

    public static void enqueue(LinkedList<Integer> ll, int num) {// помещает элемент в конец очереди
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) { // возвращает первый элемент из очереди и удаляет его
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) { // возвращает первый элемент из очереди, не удаляя
        int num = ll.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
 */
