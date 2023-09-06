package lesson2;

public class HeapSort {
    public static void main(String[] args) {

        int[] array = new int[]{
                4, 2, 5, 8, 1, 9, 0, 3, 6, 7
        };
        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void sort(int[] array) {
        // построение кучи (перегруппировка массива)
        for (int i = array.length / 2 - 1; i >= 0; i --)
            heapify(array, array.length, i);

        // один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    // функция просеивания элементов
    private  static void heapify(int[]array, int heapSize, int rootIndex) {
        int largest = rootIndex; // инициализация наибольшего элемента как корня
        int leftChild = 2 * rootIndex + 1; // левый = 2 * rootIndex + 1
        int rightChild = 2 * rootIndex + 2; // правый = 2 * rootIndex + 2

        // если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        // если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        // если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }
}
