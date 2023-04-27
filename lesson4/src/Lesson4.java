import java.util.*;


public class Lesson4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        //System.out.println(ll);

        // коллекция queue - кто первым вошел, тот и будет первым обработан FIFO
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1); // добавление новго элемента в конец списка
        //queue();
        //priorityQueue();
        //deque();
        //stack();
        taskAboutStack();
    }

    public static void queue() {
        // коллекция queue - кто первым вошел, тот и будет первым обработан FIFO
        java.util.Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1); // добавление 1-го новoго элемента в конец списка
//        System.out.print(queue);
//        queue.add(5); // добавление элемента в конец списка
//        System.out.print(queue);
//        queue.remove(); // удаление первого элемента из списка
//        System.out.print(queue);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        //System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove(); // удаляет первый элемент с начала
//        System.out.println(queue); // [3, 4, 2809]
//        item = queue.remove();
//        System.out.println(queue); // [4, 2809]
//        item = queue.poll(); // показывает приоритет извлечения элемента из списка
//        System.out.println(queue); // [2809]
//        queue.add(1);
        int item1 = queue.remove();
        queue.offer(2809);
        item1 = queue.poll();
        //System.out.println(queue);
        queue.element();
        queue.peek();

    }

    public static void priorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        //    System.out.println(pq);
    }

    public static void deque() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        System.out.println(deque);
        deque.addLast(2);
        System.out.println(deque);
        deque.removeLast(); // удаляет последний элемент
        System.out.println(deque);
//        deque.removeLast();
//        System.out.println(deque);
        deque.offerFirst(1); // добавление в начало списка
        System.out.println(deque);
        deque.offerLast(2); // добавление в конец списка
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.getFirst();
        System.out.println(deque);
        deque.getLast();
        deque.peekFirst();
        deque.peekLast();
    }

    public static void stack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack);
        stack.push(12);
        System.out.println(stack);
    }

    public static void taskAboutStack(){
        /*
        Задача Вычислить значение выражения в постфиксной форме записи
        1 + 2 * 3       превратится в 123*+
        (1 + 2) * 3     превратится в 12+3 */

        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop(); // достаем из стека последние элементы
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}



