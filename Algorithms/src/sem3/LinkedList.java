package sem3;

public class LinkedList {
    Node root;
    private int size;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            size++;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
    }

    public void addSorted(int value) {
        if (root == null) {
            root = new Node(value);
            size++;
            return;
        }
        if (root.value > value) {
            root = new Node(value, root);
            size++;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value > value) {
                currentNode.next = new Node(value, currentNode.next);
                size++;
                return;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);
        size++;
    }

    public boolean remove(int value) {
        if (root == null)
            return false;
        if (root.value == value) {
            root = root.next;
            size--;
            return true;
        }
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next;
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean removeAt(int index) {
        if (root == null)
            return false;
        if (index == 0) {
            root = root.next;
            size--;
            return true;
        }
        Node currentNode = this.getNode(index - 1);
        currentNode.next = currentNode.next.next;
        size--;
        return true;
    }

    public void quickSort() {
        if (size < 3)
            return;
        quickSort(0, size - 1);
    }

    private void quickSort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;

        int pivot = getValue((leftMarker + rightMarker) / 2);
        while (leftMarker <= rightMarker) {
            while (getValue(leftMarker) < pivot)
                leftMarker++;
            while (getValue(rightMarker) > pivot)
                rightMarker--;
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker)
                    swap(leftMarker, rightMarker);
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftMarker < rightBorder)
            quickSort(leftMarker, rightBorder);
        if (leftBorder < rightMarker)
            quickSort(leftBorder, rightMarker);
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node currentNode = root;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode;
    }

    public int getValue(int index) {
        return getNode(index).value;
    }

    public void setValue(int index, int value) {
        this.getNode(index).value = value;
    }

    public boolean contain(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.value == value)
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public void swap(int index1, int index2) {
        Node node1 = this.getNode(index1);
        Node node2 = this.getNode(index2);
        int temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }

    public void print() {
        System.out.print("[ ");
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]  size: " + size);
    }

    public int size() {
        return size;
    }

    private static class Node {
        int value;
        Node next;

        Node() {

        }

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
