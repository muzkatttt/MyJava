package lesson3;

public class SinglyList {
    Node head;
    // в односвязном списке у ноды есть ссылка только на следующую ноду

    Node tail; // для двусвязного списка, чтобы реализовать очередь
    public class Node {
        int value;
        Node next;

        Node previous; // для очереди

        // добавлять ноду tail можно, если требуется добавлять элемент в конец списка,
        // но тогда следует учитывать обработку tail в функции revert()

        // стек и очередь - два частных случая односвязного списка
    }

    // стек работает по принципу LIFO, имеет два специфических метода push(положить элемент)
    // и pop(извлечь элемент)

//    public void push(int value){
//        // для односвязного списка
//        Node node = new Node();
//        node.value = value;
//        node.next = head;
//        head = node;
//    }

    public void push(int value){
        // для двусвязного списка
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public Integer peek() {
        Integer result = null;
        if (tail != null) {
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }
    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head; // здесь обрабатывается
            revert(head.next, head);
            temp.next = null;

        }
    }
    //разворот односвязного списка лучше всего выполнять с помощью рекурсии
    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        // previousNode.next = null; // по умолчанию ссылка на след. элемент == null
        // либо на уровне базовой функции revert создать временную ноду, которая будет хранить ссылки
    }
}
