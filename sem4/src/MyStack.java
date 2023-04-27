public class MyStack {

    /*
    Реализовать стэк с помощью массива. Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
     */
    private Integer[] arr = new Integer[10];
    private int size = 0;

    int size() {
        return size;
    }

    boolean empty() {
        return size == 0;
    }

    void push(int item) {
        if (size == arr.length) {
            Integer[] arr2 = new Integer[arr.length + 10];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }

    int peek() {
        return arr[size - 1];
    }

    int pop() {
        return arr[--size];
    }
}

