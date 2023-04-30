
import java.util.LinkedList;
import java.util.Queue;

public class QueueTask2 {
    Queue<Integer> queue = new LinkedList<>();
    int size;

    int size() {
        return size;
    }

    java.util.Queue<Integer> enqueue(int item) {
        queue.add(item);
        size++;
        return queue;
    }
}






