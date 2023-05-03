
import java.util.LinkedList;


public class MyQueue {
    private LinkedList<Integer> llll = new LinkedList<>(); // llll - глобальный атрибут класса

    /*
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
    */
    public void enqueue(Integer element) {
        llll.addLast(element);
    }

    public Integer dequeue() {
        return llll.pop();
    }

    public Integer first(){
        return llll.getFirst();
    }

    @Override
    public String toString() {
        return llll.toString();
    }
}



