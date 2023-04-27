public class task4 {
    public static void main(String[] args) {
        ex4();
    }

    public static void ex4() {
            /*
    Реализовать стэк с помощью массива.
    Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
     */
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.empty());
        System.out.println("Количество элементов в стеке: " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}


