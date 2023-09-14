package sem3;

public class LinkedListT<T extends Comparable<T>> {
    Node root;
    private int size;

    private boolean isSorted = true;

    public void add(T value) {
        isSorted = false;
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

    public void addSorted(T value) {
        if (root == null) {
            root = new Node(value);
            size++;
            return;
        }
        if (root.value.compareTo(value) > 0) {
            root = new Node(value, root);
            size++;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value.compareTo(value) > 0) {
                currentNode.next = new Node(value, currentNode.next);
                size++;
                return;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);
        size++;
    }

    public boolean remove(T value) {
        if (root == null)
            return false;
        if (root.value.compareTo(value) == 0) {
            root = root.next;
            size--;
            return true;
        }
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value.compareTo(value) == 0) {
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
        isSorted = true;
        if (size < 3)
            return;
        quickSort(0, size - 1);
    }

    private void quickSort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;

        T pivot = getValue((leftMarker + rightMarker) / 2);
        while (leftMarker <= rightMarker) {
            while (getValue(leftMarker).compareTo(pivot) < 0)
                leftMarker++;
            while (getValue(rightMarker).compareTo(pivot) > 0)
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

    public T getValue(int index) {
        return getNode(index).value;
    }

    public void setValue(int index, T value) {
        isSorted = false;
        this.getNode(index).value = value;
    }

    public boolean contain(T value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.value.compareTo(value) == 0)
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public void swap(int index1, int index2) {
        Node node1 = this.getNode(index1);
        Node node2 = this.getNode(index2);
        T temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }

    public void reverse() {
        for (int i = 0; i < size / 2; i++)
            swap(i, size - i - 1);
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

    public int binarySearch(T value) {
        if (!isSorted)
            return -1;
        setIndexes();
        return binarySearch(value, 0, size - 1);
    }

    private int binarySearch(T value, int left, int right) {
        Node mid = getNode((left + right) / 2);
        if (right - left < 1)
            return -1;
        if (mid.value.compareTo(value) > 0)
            return binarySearch(value, left, (left + right) / 2);
        else if (mid.value.compareTo(value) < 0)
            return binarySearch(value, (left + right) / 2, right);
        else
            return mid.index;

    }

    private void setIndexes() {
        Node currentNode = root;
        int i = 0;
        while (currentNode != null) {
            currentNode.index = i;
            i++;
            currentNode = currentNode.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isSorted() {
        return isSorted;
    }

    private class Node {
        T value;
        Node next;
        int index;

        Node() {

        }

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
