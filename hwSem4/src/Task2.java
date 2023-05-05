import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {

        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */

        MyQueue queue = new MyQueue();
        queue.enqueue(4);
        queue.enqueue(122);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        System.out.println(queue);
        System.out.println("Удаленный элемент >>>\n" + queue.dequeue());
        System.out.println(queue);
        System.out.println("Первый элемент >>>\n" + queue.first());
        System.out.println(queue);
    }
  /*
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                list.add(getRanNum());
            }
            System.out.println(list);

            for (int i = 0; i < 5; i++) {
                System.out.print(list.getLast() + ", ");
                list.removeLast();

            }
        }
        public static int getRanNum() {
            double random = (Math.random() * 10);
            int num = (int) random;
            return num;
        }

   */
    }





