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
        queue.enqueue();
        System.out.println(queue.enqueue());
        System.out.println("Количество элементов в очереди: " + queue.enqueue());
    }
}
