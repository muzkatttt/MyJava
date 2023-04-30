import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ts2();
        ex3();
        System.out.println();
        ex4();
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
    }

    public static void ts2() {

        QueueTask2 queue = new QueueTask2();

        queue.enqueue(4);
        queue.enqueue(122);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        //System.out.println(queue.empty());
        System.out.println(queue.queue);
        System.out.println("Количество элементов в очереди: " + queue.size());
        System.out.println();
    }

    public static void ex3() {

        DequeTask2 deque = new DequeTask2();
        deque.addLast(3);
        deque.addLast(7);
        deque.addLast(9);
        deque.addLast(11);
        deque.addLast(13);
        System.out.println(deque.dequeue(0));
    }

    public static void ex4() {
        ArrayTask2 array = new ArrayTask2();
        array.addArray(1);
        array.addArray(2);
        array.addArray(3);
        array.addArray(4);
        array.addArray(5);
        System.out.println(Arrays.toString(array.array.toArray()));
        System.out.println("Первый элемент массива: " + array.array.get(0));
    }
}



