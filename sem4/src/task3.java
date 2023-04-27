import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        ex3();
    }

    public static void ex3() {
                /*
        1) Написать метод, который принимает массив элементов,
        помещает их в стэк и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов,
        помещает их в очередь и выводит на консоль содержимое очереди.
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < 5; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
