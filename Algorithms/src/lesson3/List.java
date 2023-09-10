package lesson3;

public class List {

    Node head;
    Node tail;

    /* Односвязный список невозможно обойти с конца, т.к. связи между нодами существуют
    только в одном направлении
     */

    public static void main(String[] args) {

    }
    // классический вариант вставки элемента в связный список
    public void add(int value){ // метод добавления элемента в конец списка
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;

        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }

    }

    public void add(int value, Node node) { // метод добавления элемента в середину списка
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null) {
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;

        }
    }

    public void revert() {
        Node curentNode = head;
        while (curentNode != null) {
            Node next = curentNode.next;
            Node previous = curentNode.previous;
            curentNode.next = previous;
            curentNode.previous = next;
            if (previous == null) {
                tail = curentNode;

            }
            if (next == null) {
                head = curentNode;
            }
            curentNode = next;
        }
    }

    public Node find(int value){
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        } else {
            if (next == null) {
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    public class Node {
        int value;
        Node next; // ссылка на следующий элемент в односвязном списке

        Node previous; // ссылка на предыдущий элемент в двусвязном списке
    }
}
