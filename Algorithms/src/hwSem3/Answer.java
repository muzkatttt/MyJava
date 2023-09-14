package hwSem3;


// ДЗ к семинару 3 - написать код разворота односвязного списка
class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class Answer {
    Node head;
    public void reverse() {
        // Введите свое решение ниже
        if (head != null && head.next != null) {
            Node temp = head; // здесь обрабатывается
            reverse(head.next, head);
            temp.next = null;
        }
    }
    private void reverse(Node current, Node previous) {
        if (current.next == null) {
            head = current;
        } else {
            reverse(current.next, current);
        }
        current.next = previous;
    }
}

