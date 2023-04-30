import java.util.Deque;
import java.util.LinkedList;

public class DequeTask2 {
    Deque<Integer> deque = new LinkedList<>();
    int size;

    int size() {
        return size;
    }
    Deque<Integer> dequeue(int item) { // возвращает первый элемент из очереди и удаляет его
        System.out.println("Удаленный элемент: " + deque.pollFirst());
        return deque;
    }

    Deque<Integer> addLast(int item) {
        deque.addLast(item);
        return deque;
    }

}
